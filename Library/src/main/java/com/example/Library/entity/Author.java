package com.example.Library.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="author")
public class Author extends Base{
	
	private String name;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Book> books;
	

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String name, String email, List<Book> books) {
		super();
		this.name = name;
		this.email = email;
		this.books = books;
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

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	
}
