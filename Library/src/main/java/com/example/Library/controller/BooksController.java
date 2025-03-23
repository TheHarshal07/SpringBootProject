package com.example.Library.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Library.entity.Author;
import com.example.Library.entity.Book;
import com.example.Library.service.AuthorService;
import com.example.Library.service.BookService;

@RestController
@RequestMapping("/books")
public class BooksController {
	

	BookService bookService;
	public BooksController(AuthorService authorService, BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@PostMapping("/{id}")
	public Author addBooks(@PathVariable Long id, @RequestBody Book books)
	{
		return bookService.issueBookByAuthor(id, books);
		
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable int id)
	{
		return bookService.getBookById(id);
	}
	
	@PutMapping("/{id}")
	public Book updateBookById(@PathVariable Long id, @RequestBody Book books)
	{
		return bookService.updateBook(id, books);
	}
	
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks()
	{
		return bookService.getALlBooks();
	}
	
	@DeleteMapping
	public void deleteBookbyId(@PathVariable Long id)
	{
		bookService.deleteBookById(id);
	}
	
	
}
