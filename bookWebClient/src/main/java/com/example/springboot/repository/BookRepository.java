package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

public	Book findAllByBookName(String name);

}
