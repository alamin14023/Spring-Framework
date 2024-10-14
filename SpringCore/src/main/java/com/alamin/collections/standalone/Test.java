package com.alamin.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/alamin/collections/standalone/aloneconfig.xml");

		Person person = context.getBean("person1", Person.class);
		System.out.println(person);
		//System.out.println(person.getFriends().getClass().getName());
		System.out.println(person.getProperties());
	
	}

}
