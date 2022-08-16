package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="REST_TOURIST")
public class TouristModel  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer tid;
	
	@Column( name = "Tourist_Name",   length = 20)
	@NonNull
	private String name;
	@Column(length = 20)
	@NonNull
	private  String  city;
	
	@Column(length = 20)
	@NonNull
	private  String packageType;
	@NonNull
	private  Double budget; 
	


}