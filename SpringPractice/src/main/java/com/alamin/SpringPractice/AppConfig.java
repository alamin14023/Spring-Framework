package com.alamin.SpringPractice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.alamin.SpringPractice") 
public class AppConfig {
	
	/*
	 * public BookRepository bookRepository(){ return new BookRepositoryImpl(); }
	 * 
	 * public BookService bookService() { return new BookService(bookRepository());
	 * }
	 */

}
