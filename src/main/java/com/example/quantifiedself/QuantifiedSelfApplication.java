package com.example.quantifiedself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class QuantifiedSelfApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuantifiedSelfApplication.class, args);
	}

}
