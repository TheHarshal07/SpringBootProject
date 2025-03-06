package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitty.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
