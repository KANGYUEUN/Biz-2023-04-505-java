package com.callor.books.service;

import java.util.List;

import com.callor.books.models.AuthorDto;

public interface AuthorService {

	public void loadAuthor();
	public void printAuthorList();
	
	public AuthorDto getAuthor(String isbn);
	public List<AuthorDto> getAuthorList();
	
		
}
