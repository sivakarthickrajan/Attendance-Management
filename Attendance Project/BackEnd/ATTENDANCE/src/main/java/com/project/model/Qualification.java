package com.project.model;

import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="qualification")
public class Qualification {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="qualification_generator")
	@SequenceGenerator(name="qualification_generator",sequenceName="qualification_seq",allocationSize=1)
	private int id;
	
	@Column(name="qualification")
	private String qualification;
	
	
	
	
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

	
	
	
	
	
	
}
