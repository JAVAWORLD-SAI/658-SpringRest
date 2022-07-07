package com.example.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Company;
import com.example.model.Customer;

@RestController
@RequestMapping("/test")
public class Restcontroller {
	
	@GetMapping("/data")
	public ResponseEntity<Customer> savedata(){
		Customer customer= new Customer(101, "Saichand", 5000.25 ,
				                                                      new String[]  {"Red","Yello" ,"pink"},List.of("mba","Btech","ca") , Set.of(5000L,478656L,96545L), Map.of("Addar",48565L,"pan",865368L), new Company(101,"Falkon" ,85566.500));
				HttpStatus http= HttpStatus.OK;
			return new ResponseEntity<Customer>(customer,http);
	}

}
