package com.fidel.spring_boot_security_jwt_auth.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JwtAuthenticationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationServerApplication.class, args);
	}

}
