package com.alamin.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.alamin.javaconfig")
public class Config {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student"})
	public Student getStudent() {
		Student student = new Student(getSamosa());
		return student;
	}
}
