package com.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="city_generator")
	@SequenceGenerator(name="city_generator",sequenceName="city_seq",allocationSize=0) 
	private int id;
	
	
	@Column(name="city")
	private String city;
	
	
	
	
	public int getCity_id() {
		return id;
	}
	public void setCity_id(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
