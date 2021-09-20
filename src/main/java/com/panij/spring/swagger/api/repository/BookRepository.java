package com.panij.spring.swagger.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panij.spring.swagger.api.model.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>{

}
