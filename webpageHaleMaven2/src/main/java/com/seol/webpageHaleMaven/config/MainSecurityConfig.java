package com.seol.webpageHaleMaven.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.seol.webpageHaleMaven.service.MemberService;

//스프링 시큐러티 
@Configuration
@EnableWebSecurity
public class MainSecurityConfig extends WebSecurityConfigurerAdapter{

	
//멤버 데이터베이스에 접근하여 처리하는 일을 맡은 서비스 레이어	
	@Autowired
	private MemberService  memberService;
	
//커스터마이징한 로그인 인증성공 핸들러이다.
	@Autowired
	private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.authenticationProvider(authenticationProvider());
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/member/**").hasAnyRole("MEMBER, ADMIN")
		.antMatchers("/admin/**").hasRole("ADMIN")
		.and()
		.formLogin()
		.loginPage("/login")
		.loginProcessingUrl("/authenticateTheUser")
	//성공할 경우
		.successHandler(customAuthenticationSuccessHandler)
		.permitAll()
		.and()
		.logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/access-denied");
		
	}

	
//암호화 알고리즘 빈 정의
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	
	//authenticationProvider 빈 정의
//입력받은 패스워드를 암호화하여 데이터베이스 암호와 비교한다.
//	데이터베이스 인증용 provider
//	인자로 userDetailsService를 받는다.
//	userDetailsService로 username을 이용해 디비를 조회하고
//	UserDetails로 리턴한다.

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(memberService);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}
}
