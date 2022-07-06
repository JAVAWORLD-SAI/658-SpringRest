package com.example.Model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "zooker_tab")
public class zooker {
	
	
	@Id
	@GeneratedValue
	private Integer zookerid;
	private String userName;
	private String password;
	private String name;
	private  String surname;
	private Integer phoneNumber;
	private String Address;
	private String location;
	private List<String> listitems;
	@ElementCollection
	private Double price;

}
