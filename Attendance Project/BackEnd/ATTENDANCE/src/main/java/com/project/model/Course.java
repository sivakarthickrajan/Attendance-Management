package com.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="course_generator")
	@SequenceGenerator(name="course_generator",sequenceName="course_seq",allocationSize=1)
	private int course_id;
	
	@Column(name="course_name")
	private String course_name;
	
	@Column(name="fees")
	private int fees;
	
	@Column(name="duration_month")
	private int duration_month;
	
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getDuration_month() {
		return duration_month;
	}
	public void setDuration_month(int duration_month) {
		this.duration_month = duration_month;
	}
	
	
	
	
}
