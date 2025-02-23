package com.example.SpringDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringDemo.Entity.User;
import com.example.SpringDemo.Service.UserService;

@RestController
@RequestMapping("/users")   //base url for all the http methods
public class UserController {
	
	private static final List<User> List = null;
	@Autowired
	private UserService UserService;
	
	@GetMapping("/")
	public String baseUrl()
	{
		return "Welcome Harshal";
	}
	
	//Create
	@PostMapping("/addUser")
	public List<User> addUser(@RequestBody List<User> user)
	{
		return UserService.addUser(user);
	}
	
	//Read
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable Long id)
	{
		return UserService.viewUser(id);
	}
	
	//Read
	@GetMapping("/getUser/")
	public List<User> getUser()
	{
		return UserService.viewAlluser();
	}
	
	
	//Update
	@PostMapping("/updateUser/{id}")
	public User updatUser(@PathVariable Long id, @RequestBody User user)
	{
		return UserService.updateUsers(id, user);
	}
	
}
