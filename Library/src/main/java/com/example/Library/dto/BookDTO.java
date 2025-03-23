package com.example.Library.dto;

import java.time.LocalDate;

public class BookDTO {
	
	private Long bookId;
	private String title;
	private String isbn;
	private LocalDate publishedDate;
	
	
	
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookDTO(Long bookId, String title, String isbn, LocalDate publishedDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.isbn = isbn;
		this.publishedDate = publishedDate;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	
}
