package com.example.SpringDemo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDemo.Entity.User;
import com.example.SpringDemo.Repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserRepository userRepository;

	public List<User> addUser(List<User> user) {
		// TODO Auto-generated method stub
		return userRepository.saveAll(user);
	}

	public User viewUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            logger.info("User found with ID: {}", id);
            return user.get();
        } else {
            logger.error("User not found with ID: {}", id);
            return null;  // Alternatively, you can throw an exception or handle it differently.
        }
    }
	
	public List<User> viewAlluser()
	{
		return userRepository.findAll();
	}

	
	
	public User updateUsers(Long id, User user) {
		// TODO Auto-generated method stub
		Optional<User> updatesUser = userRepository.findById(id);
		
		if(updatesUser.isPresent())
		{
			User users = updatesUser.get();
			users.setEmpName(user.getEmpName());
			users.setEmpMobile(user.getEmpMobile());
			users.setEmpSalary(user.getEmpSalary());
			
			return userRepository.save(users);
		}
		else
		{
			throw new RuntimeException("User is not found with this id "+ id);
		}
				
	}

	

}
