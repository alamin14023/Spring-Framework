package com.alamin.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//AppConfig appConfig = new AppConfig();
		
		BookService bookService = context.getBean(BookService.class);
		
		Book book = new Book("Spring", "Rod");
		
		bookService.addBook(book);
	}
}
