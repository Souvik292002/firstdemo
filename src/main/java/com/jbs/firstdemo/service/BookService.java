package com.jbs.firstdemo.service;

import java.util.HashSet;
import com.jbs.firstdemo.modal.Book;

public interface BookService {
	HashSet<Book> findAllBook();
	Book findBookByID(long id);
	void addBook(Book b);
	void deleteAllData();
}
