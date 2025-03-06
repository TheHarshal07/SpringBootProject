package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitty.User;
import com.example.demo.service.UserService;

@RestController
public class BookController {
	
	
	UserService userService;

	public BookController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	}
