package com.project.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="id")
	private int id; 
	
	@Column(name="name")
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="gender")
	private Gender gender;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="qualification")
	private Qualification qualification;
	
	
	@Column(name="mobile")
	private int mobile;
	
	@Column(name="no_of_stu_handling")
	private int no_of_stu_handling;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="city")
	private City city;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id = Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Qualification getQualification() {
		return qualification;
	}
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getNo_of_stu_handling() {
		return no_of_stu_handling;
	}
	public void setNo_of_stu_handiling(int no_of_stu_handling) {
		this.no_of_stu_handling = no_of_stu_handling;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	

}
