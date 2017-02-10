package com.okohub;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class JpaproblemApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaproblemApplication.class, args);
	}
}
