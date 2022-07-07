package com.project.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="city")
public class City {
	
	@Id
	private int id;
	
	
	@Column(name="city")
	private String city;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="city")
	private Set<Student> students= new HashSet();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="city")
	private Set<Employee> employees= new HashSet();
	
	
	
	
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
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	

}
