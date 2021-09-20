package com.panij.spring.swagger.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.panij.spring.swagger.api.model.Book;
import com.panij.spring.swagger.api.service.BookService;

@RestController

public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping("/book")
	public String savebook(@RequestBody Book book) {

		return bookService.saveBook(book);
	}

	@GetMapping("searchbook/{bookId}")
	public Optional<Book> getBook(@PathVariable int bookId) {
		return bookService.getBook(bookId);
	}

	@DeleteMapping("/deleteBook/{bookId}")
	public List<Book> deleteBook(@PathVariable int bookId) {
		return bookService.removeBook(bookId);
	}

}
