package com.example.springboot.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class BookRequest {

private int id;
private String author;
private String price;
private String bookName;
private String status; 
	
}