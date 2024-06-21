package com.example.hexagonalArchitecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
// @EnableJpaRepositories("com.example.hexagonalArchitecture.domain.ports.out")
@EntityScan("com.example.hexagonalArchitecture.domain.model")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
