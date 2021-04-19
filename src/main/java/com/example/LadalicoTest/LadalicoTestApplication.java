package com.example.LadalicoTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ( basePackages = { "com.example" })
public class LadalicoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LadalicoTestApplication.class, args);
	}

}
