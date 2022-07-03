package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping("/show")
	public ResponseEntity<String> showMessage(){
		
		String body="Welcome to restapi";
		ResponseEntity<String> responce=new ResponseEntity<String>(body, HttpStatus.OK);
		return responce;
		
	} 

}
