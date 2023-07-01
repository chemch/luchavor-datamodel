package com.luchavor.datamodel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DummyApplication.class, args);
		System.exit(0);
	}
	
	@Bean
	CommandLineRunner deleteTechniques() {
		return args -> {
			log.info("Data Model Dummy Application Run Successfully");
		};
	}
}