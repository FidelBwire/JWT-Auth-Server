package com.fidel.spring_boot_security_jwt_auth.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@Configuration
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**")
//				.allowedOrigins("http://localhost:4200")
//				.allowedMethods("GET", "POST", "PUT", "DELETE")
//				.allowedHeaders("*")
//				.exposedHeaders("*")
//				.allowCredentials(false)
//				.maxAge(180000);
//	}
	
}
