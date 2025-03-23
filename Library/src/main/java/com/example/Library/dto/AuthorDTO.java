package com.example.Library.dto;

import java.util.List;

import com.example.Library.entity.Book;

public class AuthorDTO {
	
	
	private Long id;
	private String name;
	private String email;
	private List<BookDTO> books;
	
	
	
	public AuthorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AuthorDTO(Long id, String name, String email, List<BookDTO> books) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.books = books;
	}





	public Long getAuthorId() {
		return id;
	}
	public void setAuthorId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	public List<BookDTO> getBooks() {
		return books;
	}


	public void setBooks(List<BookDTO> books) {
		this.books = books;
	}
	
}
