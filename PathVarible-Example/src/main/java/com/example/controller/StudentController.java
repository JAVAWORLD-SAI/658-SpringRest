package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/find/{stdid}/{stdname}")
	public String findstd(
			@PathVariable Integer stdid,
			@PathVariable String stdname) {
		
		return"Student data is " +stdid+ stdname;
	}
}

