package com.alamin.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/alamin/lifecycle/samosa.xml");

		context.registerShutdownHook();

		/*
		 * Samosa samosa = (Samosa) context.getBean("samosa1");
		 * System.out.println(samosa);
		 * 
		 * System.out.println("----------------------------------------");
		 * 
		 * Pepsi pepsi = (Pepsi) context.getBean("pepsi"); System.out.println(pepsi);
		 */
		Example example = (Example) context.getBean("example");
		
		System.out.println(example);

	}
}
