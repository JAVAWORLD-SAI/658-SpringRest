package com.example.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/show")
	public ResponseEntity<String> saveStudedent() {
			int id= new Random().nextInt(100);
		ResponseEntity< String> resp= null;
		
		try {
			if (id<=10) {
				resp= new ResponseEntity<String>("Invalid Number", HttpStatus.BAD_REQUEST);
			}
			else {
				resp= new ResponseEntity<String>("employee data ->" +id +"found", HttpStatus.OK);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			resp= new ResponseEntity<String>("proble found ", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}

}
