package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.Book;
import com.example.springboot.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	
	public List<Book> getAll() {
		List<Book> bookList = bookRepository.findAll();
		return bookList;
	}
	public Book addBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	public Book getBook(String name) {
		Book book =bookRepository.findAllByBookName(name);
		return book;
	}
}
