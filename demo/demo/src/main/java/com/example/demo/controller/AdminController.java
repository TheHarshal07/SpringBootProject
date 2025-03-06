package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitty.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	UserService userService;
	
	public AdminController(UserService userService)
	{
		this.userService = userService;
	}
	
	
	@GetMapping("/user")
	public List<User> getAllUser()
	{
		return userService.getAllUsers();
	}
	
	
	@GetMapping("/books/{id}")
	public User getBookById(@PathVariable int id)
	{
		return userService.getBookById(id);
	}
	
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id)
	{
		return userService.getUserById(id);
	}


}
