package com.example.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	private Integer empid;
	private String ename;
	private Double esal;
	private String[]  facol;
	private List<String> studies;
	private Set<Long>phonumber;
	private Map<String, Object>idDetails;
	
	@Autowired
	private Company comp;

}
