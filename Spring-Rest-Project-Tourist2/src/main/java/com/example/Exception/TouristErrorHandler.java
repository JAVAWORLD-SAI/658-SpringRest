package com.example.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TouristErrorHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handlerTouristNotFound(TouristNotFoundException tfe){
		
		ErrorDetails e= new ErrorDetails(LocalDateTime.now(),
																				tfe.getMessage(),
																				"404 Tourist Not Found");
		
		return new ResponseEntity<ErrorDetails>(e, HttpStatus.NOT_FOUND);
		
	}

}
