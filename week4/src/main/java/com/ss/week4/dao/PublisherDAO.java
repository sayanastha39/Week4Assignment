package com.ss.week4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ss.week4.entity.Publisher;


@Repository
public interface PublisherDAO extends JpaRepository<Publisher, Long> {

}
