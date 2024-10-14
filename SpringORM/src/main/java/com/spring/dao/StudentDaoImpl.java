package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.spring.entities.Student;

import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao {

	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void insert(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(student);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
