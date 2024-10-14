package com.alamin.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alamin/autowire/autowire.xml");
		
		Employee employee = context.getBean("emp1", Employee.class);
		
		System.out.println(employee);

	}

}
