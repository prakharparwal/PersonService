package com.prakhar.parwal.personservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.prakhar.parwal.controller, com.prakhar.parwal.web.controller, com.prakhar.parwal.service")
@EntityScan("com.prakhar.parwal.data")
@EnableJpaRepositories(basePackages = "com.prakhar.parwal.repositories")
public class PersonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonServiceApplication.class, args);
	}

}
