package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@GetMapping("/save")
	public ResponseEntity<?> saveEmp(@RequestBody Employee emp)
	{
	  boolean userexit =false;
		ResponseEntity< ?> resp= null; 
		if(userexit) {
			resp= new ResponseEntity<Employee>(emp,HttpStatus.OK);
		}
		else {
			resp=new ResponseEntity<String>("Emp not found", HttpStatus.BAD_REQUEST);
		}
		return resp;
		
	}

}
