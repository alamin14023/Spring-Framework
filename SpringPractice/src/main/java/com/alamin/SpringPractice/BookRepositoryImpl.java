
package com.alamin.SpringPractice;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	public void save(Book book) {
		System.out.println("Saving book: "+book.getTitle());
	}

}
