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
@Table(name="qualification")
public class Qualification {
	
	
	
	@Id
	private int id;
	
	@Column(name="qualification")
	private String qualification;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="qualification")
	private Set<Student> students= new HashSet();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="qualification")
	private Set<Employee> employees= new HashSet();
	
	
	
	
	public int getQualification_id() {
		return id;
	}
	public void setQualification_id(int id) {
		this.id = id;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
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
