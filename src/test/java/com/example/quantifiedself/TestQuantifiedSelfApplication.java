package com.example.quantifiedself;

import org.springframework.boot.SpringApplication;

public class TestQuantifiedSelfApplication {

	public static void main(String[] args) {
		SpringApplication.from(QuantifiedSelfApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
