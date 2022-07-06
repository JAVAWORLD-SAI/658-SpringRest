package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController    // controller+responcebody
@Controller
@RequestMapping("/test")
public class Customeroperation {
	
	@GetMapping("/one")
	@ResponseBody
	public ResponseEntity<String> showcustomerreport()
	{
		return new  ResponseEntity<String>("Get Mapping",HttpStatus.OK );
	}
	
	@PostMapping("/two")
	@ResponseBody
	public ResponseEntity<String> register() {
		return new ResponseEntity<String>("postMapping",HttpStatus.OK);
	}
	
	@PutMapping("three")
	@ResponseBody
	public ResponseEntity<String>update()
	{
		return new ResponseEntity<String> ("put mapping", HttpStatus.OK);
	}
	@PatchMapping("/four")
	@ResponseBody
	public ResponseEntity<String>updateCustomerid() {
		return new ResponseEntity<String>("patch mapping",HttpStatus.OK);
	}
	
	@DeleteMapping("/five")
	@ResponseBody
	public ResponseEntity<String>deletecustomer(){
		return new ResponseEntity<String>("Delete Mapping", HttpStatus.OK);
	}
}
