package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Book;
import com.example.springboot.service.BookService;

@RestController
@RequestMapping("/BookService")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public List<Book> getAllBook(){
		List<Book> bookList = bookService.getAll();
		return bookList;
	}
	@GetMapping("/book/{name}")
	public Book getBook(@PathVariable("name") String name) {
		return bookService.getBook(name);
	}
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book ) {
		bookService.addBook(book);
		return book;
	}

}
