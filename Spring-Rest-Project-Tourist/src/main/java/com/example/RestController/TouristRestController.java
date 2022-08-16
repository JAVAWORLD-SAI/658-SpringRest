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

import com.example.Service.ITouristService;
import com.example.model.TouristModel;

@RestController
@RequestMapping("/tourist")
public class TouristRestController {
	@Autowired
	 private ITouristService  service;
	
	@PostMapping("/register")
	public ResponseEntity<String>  enrollTourist(@RequestBody TouristModel tourist){
		try {
		//use service
		String resultMsg=service.registerTourist(tourist);
		 return  new ResponseEntity<String>(resultMsg,
				                                                                     HttpStatus.CREATED); //201 content created successfully 
		}
		catch(Exception e) {
			e.printStackTrace();
			return  new ResponseEntity<String>("problem in tourist enrollment",
                    HttpStatus.INTERNAL_SERVER_ERROR); //500 error
		}
		
	}
	
	
	@GetMapping("/findall")
	public ResponseEntity<?> displayAll()
	{
		try {
		 List<TouristModel> list=service.fetechAllTourist();
		return  new ResponseEntity<List<TouristModel>>(list, HttpStatus.OK);
		}
		catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Data not found", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
	
		@GetMapping("/find/{id}")
			public ResponseEntity<?> displayTouristByid(@PathVariable Integer id){
			
			try {
				
				TouristModel tourist=service.FetchTouristById(id);
				
				return new  ResponseEntity<TouristModel>(tourist, HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<String>("Tourist not FOund", HttpStatus.NOT_FOUND);
			}
				
			}
		
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<?> deleteTourist(@PathVariable Integer id){
			
			try {
				  String touristModel= service.DeleteTourist(id);
				  return new ResponseEntity<String>(touristModel, HttpStatus.OK);
			} catch (Exception e) {
				
				e.printStackTrace();
				return new ResponseEntity<String>("Data ot Found", HttpStatus.FAILED_DEPENDENCY);
			}		
			
		}
		
		@PatchMapping("/budgetModify/{id}/{budget}")
		public ResponseEntity<?> UpdatePatch(@PathVariable Integer id ,
																							@PathVariable Double budget){
			try {
				String update=service.UpdateTouristByid(id, budget);
				return new ResponseEntity<String>(update, HttpStatus.OK);
				
			} catch (Exception e) {
				e.printStackTrace();
					return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
			}
			
	
		}
	
}