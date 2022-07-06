package com.example.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MessageRenderController {
	
	@GetMapping("/one")
	public ResponseEntity<String> generateMessage() {
		
		LocalDateTime ldt= LocalDateTime.now();
		int  hour=ldt.getHour();
		String body= null;
		if(hour<12)
			body="Good Morning";
		else if(hour<16)
			body="Good AfterNoon";
		else if (hour<20)
			body="Good evening";
		else
			body="Good night";
		//HttpStatus  status=HttpStatus.OK;
		HttpStatus  status=HttpStatus.CREATED;
		ResponseEntity<String>entity= new ResponseEntity<String>(body,status);
		return entity;

	}

}
