package com.rhuldip.origin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan( basePackages = {"com.rhuldip.entity"})
@ComponentScan("com.rhuldip")
@SpringBootApplication
public class SpringBootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningApplication.class, args);
	}
}
