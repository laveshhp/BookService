package com.panij.spring.swagger.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panij.spring.swagger.api.model.Book;
import com.panij.spring.swagger.api.repository.BookRepository;

@Service
public class BookService {
    @Autowired
	private BookRepository repository;
    
    public String saveBook(Book book) {
       	repository.save(book);
    	return "Book save with id "  ;
    }
     public Optional<Book> getBook(int bookId) {
    	 return repository.findById(bookId);
    	 
     }
     
     public List<Book> removeBook(int bookId){
    	 repository.deleteById(bookId);
    	 return repository.findAll();
     }
     
}
