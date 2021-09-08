package com.example.mycosmetics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MyCosmeticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCosmeticsApplication.class, args);
	}

}
