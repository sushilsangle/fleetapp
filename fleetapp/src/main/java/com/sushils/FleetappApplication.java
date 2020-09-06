package com.sushils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class FleetappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetappApplication.class, args);
	}

}
