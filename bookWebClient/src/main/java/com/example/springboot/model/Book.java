package com.example.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name ="Book")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String author;
private String price;
private String bookName;
	
}
