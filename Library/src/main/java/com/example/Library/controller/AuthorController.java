package com.example.Library.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Library.dto.AuthorDTO;
import com.example.Library.dto.LibraryMapper;
import com.example.Library.entity.Author;
import com.example.Library.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
		
	AuthorService authorService;

	public AuthorController(AuthorService authorService) {
		super();
		this.authorService = authorService;
	}
	
	@PostMapping
	public Author creatAuthor(@RequestBody Author author)
	{
		return authorService.createAuthor(author);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AuthorDTO> getAuthorById(@PathVariable Long id)
	{	
		Author author = authorService.getAuthorById(id);
		if(author == null)
		{
			return ResponseEntity.notFound().build();
		}
		
		AuthorDTO dto = LibraryMapper.toAuthorDto(author);
		return ResponseEntity.ok(dto);
	}
	
	@PutMapping("/{id}")
	public Author updateAuthorById(@PathVariable Long id, @RequestBody Author auth)
	{
		return authorService.updateAuthor(id, auth);
	}
	
	
	@GetMapping("/getAllUser")
	public List<Author> getAllAuthor()
	{
		return authorService.getALlAuthor();
	}
	
	@DeleteMapping
	public void deleteAuthorbyId(@PathVariable Long id)
	{
		authorService.deleteAuthorById(id);
	}
	
}
