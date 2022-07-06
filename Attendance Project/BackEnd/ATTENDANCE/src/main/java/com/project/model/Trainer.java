package com.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE) 
	private int trainer_id; 
	
	@Column(name="trainer_name")
	private String trainer_name;
	
	@Column(name="mobile")
	private int mobile;
	
	@Column(name="no_of_stu_handling")
	private int no_of_stu_handling;
	
	
	
	private int city;
	private int attendance;
	
	
	
	
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
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
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	
	
	
	
	

}
