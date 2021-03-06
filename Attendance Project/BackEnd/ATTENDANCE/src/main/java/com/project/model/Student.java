package com.project.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;	
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name= "name")
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="gender")
	private Gender gender;
	
	@Column(name="age")
	private int age;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="qualification")
	private Qualification qualification;
	
	
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="mobile")
	private int mobile;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="city", nullable=false)
	private City city;
	

	@Column(name="attendance")
	private int attendance;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Qualification getQualification() {
		return qualification;
	}
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance=attendance;
	}
	

}
