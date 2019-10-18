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

import com.ss.week4.dao.PublisherDAO;
import com.ss.week4.entity.Publisher;


@RestController
@RequestMapping("/lms")
public class PublisherController {

	@Autowired
	private PublisherDAO publisherDAO;
	
	@GetMapping("/publisher")
	public List<Publisher> getAllPublisher() {
	    return publisherDAO.findAll();
	}
	
	
	// Create a new Note
	@PostMapping("/publisher")
	public Publisher createNote(@Valid @RequestBody Publisher publisher) {
	    return publisherDAO.save(publisher);
	}
	
	@PutMapping("/publisher")
	public Publisher updateNote(@Valid @RequestBody Publisher publisher) {
	    return publisherDAO.save(publisher);
	}
	
	@DeleteMapping("/publisher")
	public void deleteNote(@Valid @RequestBody Publisher publisher) {
	    publisherDAO.delete(publisher);
	}
}
