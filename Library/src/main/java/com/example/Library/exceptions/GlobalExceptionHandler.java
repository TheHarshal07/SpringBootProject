package com.example.Library.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(InvalidException.class)
	public ResponseEntity<String> handlingInvalidException(InvalidException ex)
	{
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.LENGTH_REQUIRED);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handlingGlobalException(Exception es)
	{
		return new ResponseEntity<>(es.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
