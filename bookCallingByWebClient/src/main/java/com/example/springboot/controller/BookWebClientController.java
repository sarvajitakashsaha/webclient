package com.example.springboot.controller;

import javax.annotation.PostConstruct;

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

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/book-client")
public class BookWebClientController {
	public WebClient webclient;
	@PostConstruct
	public void init() {
		webclient = WebClient.builder().baseUrl("http://localhost:8582/BookService/")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
	}
	@SuppressWarnings("deprecation")
	@PostMapping("/addbook")
	//Mono means it will return a single response
	public Mono<BookRequest> addBook(@RequestBody BookRequest book){
		return webclient.post().uri("/book").syncBody(book).retrieve().bodyToMono(BookRequest.class);
	}
	
	@GetMapping("/getbooks")
	//Flux means it will return a list of record
	public Flux<BookRequest> getAllBooks(){
		return webclient.get().uri("/book").retrieve().bodyToFlux(BookRequest.class);
	}
	@GetMapping("/getBook/{name}")
	public Mono<BookRequest> getBook(@PathVariable String name){
		return webclient.get().uri("/book/"+name).retrieve().bodyToMono(BookRequest.class);
	}
	

}
