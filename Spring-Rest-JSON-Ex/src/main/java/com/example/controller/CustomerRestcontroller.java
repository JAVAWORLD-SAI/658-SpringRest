package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Customer;

@RestController
@RequestMapping("/test")
public class CustomerRestcontroller {
	
	@GetMapping("data")
	public ResponseEntity<Customer> showData(){
		Customer customer= new Customer(101,"Saichand", 5478.5);
		HttpStatus http= HttpStatus.OK;
		return new ResponseEntity<Customer>(customer, http);
	}

}
