package com.docker.springboot.clientdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "user and request details Services", version = "1.0", description = "get request and user details"))
@SpringBootApplication
public class RequestUserAndRequestDetailsApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RequestUserAndRequestDetailsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RequestUserAndRequestDetailsApplication.class, args);
	}

}
