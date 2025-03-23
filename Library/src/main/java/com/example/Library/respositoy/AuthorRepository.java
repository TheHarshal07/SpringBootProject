package com.example.Library.respositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Library.entity.Author;

public interface AuthorRepository extends JpaRepository<Author ,Long> {

}
