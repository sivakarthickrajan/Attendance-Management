package com.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="present_days")
	private int present_days;
	
	@Column(name="absent_days")
	private int absent_days;
	
	@Column(name="total_days")
	private int total_days;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPresent_days() {
		return present_days;
	}
	public void setPresent_days(int present_days) {
		this.present_days = present_days;
	}
	public int getAbsent_days() {
		return absent_days;
	}
	public void setAbsent_days(int absent_days) {
		this.absent_days = absent_days;
	}
	public int getTotal_days() {
		return total_days;
	}
	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}
	
	
	
	
	
}
