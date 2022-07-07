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
@Table(name="gender")
public class Gender {
	
	@Id
	private int id;
	
	@Column(name="gender")
	private String gender;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="gender")
	private Set<Student> students=new HashSet();
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="gender")
	private Set<Employee> employees= new HashSet();
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
