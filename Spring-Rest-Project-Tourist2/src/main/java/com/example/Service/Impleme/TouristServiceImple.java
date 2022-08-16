package com.example.Service.Impleme;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Exception.TouristNotFoundException;
import com.example.Repo.ITouristRepo;
import com.example.Service.ITouristService;
import com.example.model.TouristModel;

@Service("touristService")
public class TouristServiceImple implements ITouristService {
	 @Autowired
	private ITouristRepo   touristRepo;

	@Override
	public String registerTourist(TouristModel tourist) {
	       int idVal=touristRepo.save(tourist).getTid();
		return "Tourist is registered  having the id value ::"+idVal;
	}
	
	
	@Override
	public List<TouristModel> fetechAllTourist() {		
					  	List<TouristModel> list=touristRepo.findAll();
					  	list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));
		return list;
	}
				
	@Override
	public TouristModel FetchTouristById(Integer tid) throws TouristNotFoundException {
		return touristRepo.findById(tid)
				         .orElseThrow(()->new  TouristNotFoundException(tid +"tourist not Found Exception"));
	}
	
	
	@Override
	public String DeleteTourist(Integer id) throws TouristNotFoundException {
		Optional<TouristModel> opt= touristRepo.findById(id);
		if (opt.isPresent()) {
			touristRepo.delete(opt.get());
			return id +"Tourist Deleted";
		}
		else
			throw new TouristNotFoundException(id+" Tourist Not Found Exception");
	}
	
	@Override
	public String UpdateTouristByid(Integer id, Double budget) throws TouristNotFoundException {
		
		      Optional<TouristModel> opt=touristRepo.findById(id);
		      
		      if (opt.isPresent()) {
				TouristModel tourist= opt.get();
				tourist.setBudget(tourist.getBudget()+(tourist.getBudget()*(tourist.getTid())));
				touristRepo.save(tourist);
				return "tourist Is updatd";
			}
		      else
		    	  throw new TouristNotFoundException("Tourist Not Updated");
		
	}
	
	
}