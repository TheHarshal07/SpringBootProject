package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitty.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
