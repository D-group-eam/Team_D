package com.seol.webpageHaleMaven.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.seol.webpageHaleMaven")
public class MainAppConfig {

	@Bean
	public ViewResolver viewResolver() {
		
		return null;
	}
}
