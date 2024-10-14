package com.alamin.javaconfig;

import org.springframework.stereotype.Component;


//@Component
public class Student {

	private Samosa samosa;
	
	public void study() {
		samosa.display();
		System.out.println("Reading...");
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
}
