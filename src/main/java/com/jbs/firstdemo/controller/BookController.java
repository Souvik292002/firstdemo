package com.jbs.firstdemo.controller;

import java.util.HashSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbs.firstdemo.service.BookServiceImpl;
import com.jbs.firstdemo.modal.Book;

@RestController
public class BookController {
	@Autowired
	BookServiceImpl bookServiceImpl;
	
	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
		bookServiceImpl.addBook(book);
	}
	
	@GetMapping("/findAll")
	public HashSet<Book> getAllBook() {
		return bookServiceImpl.findAllBook();
	}
	
	@GetMapping("/findbyid/{id}")
	public Book getBookById(@PathVariable long id) {
		return bookServiceImpl.findBookByID(id);
	}
	
	@DeleteMapping("/delete")
	public void deleteBook() {
		bookServiceImpl.deleteAllData();
	}
}
