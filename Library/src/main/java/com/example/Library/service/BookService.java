package com.example.Library.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Library.entity.Author;
import com.example.Library.entity.Book;
import com.example.Library.respositoy.AuthorRepository;
import com.example.Library.respositoy.BookRepository;

@Service
public class BookService {
	
	BookRepository bookRepository;
	AuthorRepository authorRepository;

	public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}
	
	

	public Author issueBookByAuthor(Long id, Book books) {
		// TODO Auto-generated method stub
		Author author = authorRepository.findById(id).orElse(null);
		
		List<Book> bookss = new ArrayList<>();
		books.setAuthor(author);
		books.setPublishedDate(LocalDate.now());
		bookss.add(books);
		author.setBooks(bookss);
		bookRepository.save(books);
		authorRepository.save(author);
		
		return author;
		
		
	}

	public Book getBookById(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).orElse(null);
	}

	public Book updateBook(Long id, Book books) {
		// TODO Auto-generated method stub
		Book bks = bookRepository.findById(id).orElse(null);
		
		bks.setTitle(books.getTitle());
		bks.setIsbn(books.getIsbn());
		bks.setPublishedDate(books.getPublishedDate());
		bks.setAuthor(books.getAuthor());
		
		return bks;
	}

	public List<Book> getALlBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	public void deleteBookById(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

}
