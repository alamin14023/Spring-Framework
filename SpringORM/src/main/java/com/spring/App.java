package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.StudentDao;
import com.spring.entities.Student;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = (StudentDao)context.getBean("studentDao");
		Student student = new Student(101, "Suprim", "Rangamati");
		studentDao.insert(student);

	}
}
