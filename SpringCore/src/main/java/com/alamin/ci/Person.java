package com.alamin.ci;

public class Person {
	
	private String name;
	private String id;
	private Certi certi;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String id, Certi certi) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.name+" : "+this.id+" : "+"{ "+this.certi.name+" }";
	}
	
	

}
