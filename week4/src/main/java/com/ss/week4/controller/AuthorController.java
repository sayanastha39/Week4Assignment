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

import com.ss.week4.dao.AuthorDAO;
import com.ss.week4.entity.Author;


@RestController
@RequestMapping("/lms")
public class AuthorController {
 
	@Autowired
	private AuthorDAO authorDAO;
	
	@GetMapping("/author")
	public List<Author> getAllAuthor() {
	    return authorDAO.findAll();
	}
	
	// Create a new Note
	@PostMapping("/author")
	public Author createNote(@Valid @RequestBody Author author) {
	    return authorDAO.save(author);
	}
	
	@PutMapping("/author")
	public Author updateNote(@Valid @RequestBody Author author) {
	    return authorDAO.save(author);
	}
	
	@DeleteMapping("/author")
	public void deleteNote(@Valid @RequestBody Author author) {
	    authorDAO.delete(author);
	}
}
