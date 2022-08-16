package com.example.Service;

import java.util.List;

import com.example.Exception.TouristNotFoundException;
import com.example.model.TouristModel;

public interface ITouristService {
	
	  public   String  registerTourist(TouristModel tourist);
	  
	  public List<TouristModel> fetechAllTourist();
	  
	  public TouristModel FetchTouristById(Integer tid)throws TouristNotFoundException;
	  
	  public String DeleteTourist(Integer id) throws TouristNotFoundException;
	  
	  public String UpdateTouristByid(Integer id, Double budget)throws TouristNotFoundException;
}



