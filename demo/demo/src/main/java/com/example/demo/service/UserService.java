package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entitty.Book;
import com.example.demo.entitty.User;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	UserRepository userRepository;
	BookRepository bookRepository;

	public UserService(UserRepository userRepository, BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	public User getBookById(int id) {
		
		return userRepository.findById(id).orElse(null);
	}

	public User addUser(User user) {
		
		return userRepository.save(user);
	}

	public Book addBook(Book book, int id) {
		
		User us = userRepository.findById(id).orElse(null);
		
		us.getBook().add(book); //add book to user list
		bookRepository.save(book); // save the book 
		userRepository.save(us);// save the user wit updated list
		
		return book;
		
		
	}

	public User getUserById(int id) {
		return userRepository.findById(id).orElse(null);
	}

}
