package com.alamin.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/alamin/stereotype/stereoconfig.xml");
		
		Student student = context.getBean("ob",Student.class);
		//System.out.println(student);
		
		Teacher teacher = context.getBean("teacher",Teacher.class);
		Teacher teacher1 = context.getBean("teacher",Teacher.class);
		System.out.println(teacher.hashCode());
		System.out.println(teacher1.hashCode());
	}

}
