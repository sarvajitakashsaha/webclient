package com.example.springboot;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.springboot.model.BookRequest;

import lombok.experimental.PackagePrivate;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication

public class BookCallingByWebClientApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(BookCallingByWebClientApplication.class, args);
	}

}
