package com.ss.week4.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.week4.dao.BookDAO;
import com.ss.week4.entity.Book;


@RestController
@RequestMapping("/lms")
public class BookController {
 
	@Autowired
	private BookDAO bookDAO;
	
	@GetMapping("/book")
	public List<Book> getAllBook() {
	    return bookDAO.findAll();
	}
	
	// Create a new Note
	@PostMapping("/book")
	public Book createNote(@Valid @RequestBody Book book) {
	    return bookDAO.save(book);
	}
	@PutMapping("/book")
	public Book updateNote(@Valid @RequestBody Book book) {
	    return bookDAO.save(book);
	}
	
	@DeleteMapping("/book")
	public void deleteNote(@Valid @RequestBody Book book) {
	  bookDAO.delete(book);
	}
}

