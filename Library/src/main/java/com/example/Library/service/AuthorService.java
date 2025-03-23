package com.example.Library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Library.entity.Author;
import com.example.Library.exceptions.InvalidException;
import com.example.Library.respositoy.AuthorRepository;

@Service
public class AuthorService {
	
	AuthorRepository authorRepository;

	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
		
	}

	public Author createAuthor(Author author) throws InvalidException {
		
		if(author.getName().length() < 3)
		{
			throw new InvalidException("lenght of the name shoudl be greated than 3");
		}
		
		if(author.getEmail() == null)
		{
			throw new InvalidException("email field cannot be empty ");
		}
		
		return authorRepository.save(author);
	}

	public Author getAuthorById(Long id) {
		// TODO Auto-generated method stub
		return authorRepository.findById(id).orElse(null);
	}

	public Author updateAuthor(Long id, Author auth) {
			Author auths = authorRepository.findById(id).orElse(null);
			
			auths.setName(auth.getName());
			auths.setEmail(auth.getEmail());
			auths.setBooks(auth.getBooks());
			
			return auths;	
	}

	public List<Author> getALlAuthor() {
		// TODO Auto-generated method stub
		return authorRepository.findAll();
	}

	public void deleteAuthorById(Long id) {
		// TODO Auto-generated method stub
		
		authorRepository.deleteById(id);

		
	}

}
