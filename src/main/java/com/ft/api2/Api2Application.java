package com.ft.api2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class Api2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Api2Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("FT - API 2")
						.version("0.1")
						.description("Api development")
						.termsOfService("http://swagger.io/terms/*")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

}
