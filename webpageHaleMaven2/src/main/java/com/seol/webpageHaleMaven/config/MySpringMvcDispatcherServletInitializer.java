package com.seol.webpageHaleMaven.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	
	@Override
	protected Class<?>[] getRootConfigClasses(){
		
		return null;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses(){
		return new Class[] {MainAppConfig.class};
	}
	
	

//애플리케이션으로 오는 모든 요청을 처리
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	

}
