package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitty.Book;
import com.example.demo.entitty.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	//add users
	@PostMapping
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	
	//Issued book by Id
	@PostMapping("/{id}")
	public Book addBook(@RequestBody Book book, @PathVariable int id)
	{
		return userService.addBook(book, id);
	}
	
}
