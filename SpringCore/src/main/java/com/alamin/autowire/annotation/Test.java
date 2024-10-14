package com.alamin.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alamin/autowire/annotation/autowire.xml");
		
		Employee employee = context.getBean("emp1", Employee.class);
		Address address = context.getBean("address1",Address.class);
		
		System.out.println(employee);

	}

}
