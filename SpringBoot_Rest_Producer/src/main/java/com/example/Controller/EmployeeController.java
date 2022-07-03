package com.example.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeController {

		  @PostMapping("/save")
		//	@GetMapping("/save")
		public ResponseEntity<String> savedEmployee() {
				
			if(5<3)
			throw new RuntimeException("Dummy");
			 ResponseEntity<String> responce= new ResponseEntity<String>("Emp is not saved", HttpStatus.OK);
			
			 return responce;
		}

			
		
		@GetMapping("/get")
		public ResponseEntity<String> getEmp( ){
			ResponseEntity<String> responce= new ResponseEntity<String>("get One emp", HttpStatus.OK);
			return responce;
		}
		
		@DeleteMapping("/delete")
		public ResponseEntity<String>  DeleteEmp() {
			ResponseEntity<String> respose= new ResponseEntity<String>("delete emp", HttpStatus.OK);
			return respose;
		}
		
		@PutMapping("/update")
		public ResponseEntity<String> updateEmp() {
			ResponseEntity<String> responce= new ResponseEntity<String>("Update emp", HttpStatus.OK);
			return responce;
		}
}
