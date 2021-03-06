package com.example.demo;


import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerSpringApplication.class, args);
	}
	
	
//	For customizing Swagger 
	
	@Bean
	Docket configureSwagger() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/app/**"))
				.build()
				
				.apiInfo(new ApiInfo("User API Documentation",
						"A Sample API for Users",
						"1.0.0",
						"Learning is Fun",
						new Contact("Mahesh", "www.maheshlearning.com", "contact@mahesh.com"), 
						"Standard API License",
						"www.mahesh.com",
						Collections.emptyList()));
				
				
	}
	
}
