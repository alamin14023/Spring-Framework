package com.alamin.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		//Student student = context.getBean("student",Student.class);
		Student student1 = context.getBean("student", Student.class);
		student1.study();
		
		
	}
}
