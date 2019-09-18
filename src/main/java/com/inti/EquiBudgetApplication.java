package com.inti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EquiBudgetApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquiBudgetApplication.class, args);
	}

	/*@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}*/
}
