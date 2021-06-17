package com.seol.webpageHaleMaven.config;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.ognl.ParseException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages="com.seol.webpageHaleMaven")
@PropertySource("classpath:persistence-mysql.properties")
public class MainAppConfig implements WebMvcConfigurer {

	
	@Autowired
	private Environment env;
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Bean
	public ViewResolver viewResolver() {

		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
// /WEB-INF/views/home.jsp 란 파일을 찾을 수 있도록 뷰 리졸버를 등록	
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public DataSource securityDataSource() {
		

		ComboPooledDataSource securityDataSource = new ComboPooledDataSource();

		try {
			//securityDataSource.setDriverClass("com.mysql.jdbc.Driver");// 비추천		
			securityDataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		}
		catch (PropertyVetoException exc) {
			throw new RuntimeException(exc);
		}
		
		logger.info("jdbc.url=" + env.getProperty("jdbc.url"));
		logger.info("jdbc.user=" + env.getProperty("jdbc.user"));
		
// 데이터 베이스 연결을 설정한다.
		securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
		securityDataSource.setUser(env.getProperty("jdbc.user"));
		securityDataSource.setPassword(env.getProperty("jdbc.password"));
		
// connection pool을 설정한다.
		securityDataSource.setInitialPoolSize(
		getIntProperty("connection.pool.initialPoolSize"));

		securityDataSource.setMinPoolSize(
				getIntProperty("connection.pool.minPoolSize"));
		
		securityDataSource.setMaxPoolSize(
				getIntProperty("connection.pool.maxPoolSize"));
		
		securityDataSource.setMaxIdleTime(
				getIntProperty("connection.pool.maxIdleTime"));
				
		return securityDataSource;
	}
	
	
//변수 변환
	private int getIntProperty(String propName) {
		
		String propVal = env.getProperty(propName);
		
		// now convert to int
		int intPropVal = Integer.parseInt(propVal);
		
		return intPropVal;
	}
	
	private Properties getHibernateProperties() {

		// set hibernate properties
		Properties props = new Properties();

		props.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
	
		return props;				
	}

	
//세션 팩토리
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		
		// create session factorys
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		
	//SessionFactory와 같이 사용될 DataSource를 등록합니다.
		sessionFactory.setDataSource(securityDataSource());
		sessionFactory.setPackagesToScan(env.getProperty("hiberante.packagesToScan"));
		sessionFactory.setHibernateProperties(getHibernateProperties());
		
		return sessionFactory;
	}
	
//Transaction을 사용하기 위한 PlatformTransactionManager interface의 구현체를 등록
//SessionFactoryBean에서 생성되는 SessionFactory를 등록시켜줍니다.

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		
		// setup transaction manager based on session factory
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);

		return txManager;
	}	
	
	// MyBatis Config
	/*
	 
	@Bean
	// public SqlSessionFactoryBean getSqlSessionFactoryBean() throws Exception {
	public SqlSessionFactory getSqlSessionFactoryBean() throws Exception {
		
		SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
		
		Properties props = new Properties();
		props.setProperty("mapUnderscoreToCamelCase", "true");
		ssfb.setConfigurationProperties(props);		
				
		ssfb.setTypeAliasesPackage("com.seol.webpageHaleMaven.entity");
		ssfb.setDataSource(this.securityDataSource());
		
		ssfb.setMapperLocations(new PathMatchingResourcePatternResolver()
			.getResources("classpath:/mapper/*.xml"));

		return ssfb.getObject();
	} //
	
	@Bean
	public SqlSessionTemplate getSqlSessionTemplate() throws Exception {
		
		SqlSessionTemplate sst 
			= new SqlSessionTemplate((SqlSessionFactory) this.getSqlSessionFactoryBean());

		return sst;
	} // 
	*/
	
/*	@Bean
    public PlatformTransactionManager getTransactionManager() 
    			throws URISyntaxException, GeneralSecurityException, ParseException, IOException {
        
		return new DataSourceTransactionManager(this.securityDataSource());
    } //
*/	
	
	 @Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!registry.hasMappingForPattern("/resources/**")) {
            registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/")
                .setCachePeriod(20);
            
            //webjars js
            registry.addResourceHandler("/webjars/**")
            	.addResourceLocations("classpath:/META-INF/resources/webjars/");
            //css
            registry.addResourceHandler("/css/**")
            	.addResourceLocations("/resources/css/");
            //img
            registry.addResourceHandler("/img/**")
            	.addResourceLocations("file:///D:/upload/image/");
  //      		.addResourceLocations("/resources/img/");
            
            //js
            registry.addResourceHandler("/js/**")
        		.addResourceLocations("/resources/js/");
            //이미지 파일 불러올 때 맵퍼 
            registry.addResourceHandler("/upload/**")
    		.addResourceLocations("file:///D:/upload/");
            
        }  
    }	
}
