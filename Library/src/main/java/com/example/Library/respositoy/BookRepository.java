package com.example.Library.respositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
