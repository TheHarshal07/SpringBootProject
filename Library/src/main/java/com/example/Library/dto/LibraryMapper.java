package com.example.Library.dto;

import java.util.stream.Collectors;

import com.example.Library.entity.Author;
import com.example.Library.entity.Book;

public class LibraryMapper {

	public static AuthorDTO toAuthorDto(Author author)
	{
		return new AuthorDTO(
				
				author.getId(),
				author.getName(),
				author.getEmail(),
				author.getBooks() != null
				? author.getBooks().stream().map(LibraryMapper::toBookDto).collect(Collectors.toList())
				: null
				
				);
				
	}
	
	public static BookDTO toBookDto(Book book)
	{
		return new BookDTO(
				
				book.getId(),
				book.getTitle(),
				book.getIsbn(),
				book.getPublishedDate()
				);
	}
	
}
