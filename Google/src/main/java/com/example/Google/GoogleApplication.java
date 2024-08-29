package com.example.Google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GoogleApplication {

	public static void main(String[] args) {


		System.out.println("hello world");

		SpringApplication.run(GoogleApplication.class, args);
	}

}
