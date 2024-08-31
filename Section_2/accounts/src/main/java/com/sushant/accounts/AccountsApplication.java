package com.sushant.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservices REST API Documentation",
				description = "BiharBank Accounts Microservices REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Sushant Kumar",
						email = "digitalsushant17@gmail.com",
						url = "http://www.digitalsushant.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "http://www.digitalsushant.com"
				)
				),
		externalDocs = @ExternalDocumentation(
				description = "BiharBank Accounts Microservices REST API Documentation",
				url = "http://www.digitalsushant.com/swagger-ui.html"
		)
)
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@SpringBootApplication
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
