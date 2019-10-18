package com.ss.week4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ss.week4.entity.Author;


@Repository
public interface AuthorDAO extends JpaRepository<Author, Long> {

}
