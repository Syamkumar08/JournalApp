package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class SpringBootJournalAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalAppApplication.class, args);
	}
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Company Management Service").description(
				"This microservice handles operations related to company such as Company registration, Company deletion, "
						+ "Retrieve company details by company code, Retrieve all company details. "));
	}
}
