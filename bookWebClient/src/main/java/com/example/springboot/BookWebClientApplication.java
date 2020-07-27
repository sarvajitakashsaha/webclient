package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookWebClientApplication.class, args);
		System.out.println("Book application Started");
	}

}
