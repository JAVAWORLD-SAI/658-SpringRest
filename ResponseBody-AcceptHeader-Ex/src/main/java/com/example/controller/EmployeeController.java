package com.example.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Employee;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeController {
	
	@GetMapping("/saveA")
	public String saveEmp() {
		return "Welcome to company";
	}
	
	@GetMapping("/saveB")
	public ResponseEntity<String> saveEmp1() {
		
		return  new ResponseEntity<String>("WELCOME TO COMPANY" ,HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/getA")
	public  List<Employee> listEmp() {
		
		return List.of(
				new Employee( 101,"S" ,50.5),
				new Employee( 102,"a" ,51.5),
				new Employee( 103,"i" ,52.5))
				;
	}
	
	@GetMapping("/listc")
	public  ResponseEntity<List<Employee>> listEmpA()
	{
		return new ResponseEntity<List<Employee>> (
				List.of(
						new Employee(45, "n", 786.50),
						new Employee(12, "d", 96.50)),HttpStatus.CREATED);
	}			
				
		
	@GetMapping("/objA")
	public Employee obj() {
		return new Employee(102, "gfhj", 789.6);
	}
	
	@GetMapping("/objB")
	public ResponseEntity<Employee> objB(){
		
		return new ResponseEntity<Employee>(
															new Employee(45, "n", 786.50),HttpStatus.CREATED);
	}
	

}
