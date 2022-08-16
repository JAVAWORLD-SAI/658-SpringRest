package com.example.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.TouristNotFoundException;
import com.example.Service.ITouristService;
import com.example.model.TouristModel;

@RestController
@RequestMapping("/tourist")
public class TouristRestController {
	@Autowired
	 private ITouristService  service;
	
	@PostMapping("/register")
	public ResponseEntity<String>  enrollTourist(@RequestBody TouristModel tourist) throws Exception{
		
		String resultMsg=service.registerTourist(tourist);
		 return  new ResponseEntity<String>(resultMsg,
				                                                                     HttpStatus.CREATED); //201 content created successfully 
	}
	@GetMapping("/findall")
	public ResponseEntity<?> displayAll() throws Exception
	{
		List<TouristModel> list=service.fetechAllTourist();
		return  new ResponseEntity<List<TouristModel>>(list, HttpStatus.OK);
		
	}
		
		@GetMapping("/find/{id}")
			public ResponseEntity<?> displayTouristByid(@PathVariable Integer id) throws Exception{
			
			TouristModel tourist=service.FetchTouristById(id);
			
			return new  ResponseEntity<TouristModel>(tourist, HttpStatus.OK);
		}
			
		
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<?> deleteTourist(@PathVariable Integer id) throws Exception{
			
			 String touristModel= service.DeleteTourist(id);
			  return new ResponseEntity<String>(touristModel, HttpStatus.OK);
			
		}
		
		@PatchMapping("/budgetModify/{id}/{budget}")
		public ResponseEntity<?> UpdatePatch(@PathVariable Integer id ,
																							@PathVariable Double budget) throws Exception{
			
			String update=service.UpdateTouristByid(id, budget);
			return new ResponseEntity<String>(update, HttpStatus.OK);
		}
}
			