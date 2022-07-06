package com.project.main;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.project.model.City;
import com.project.model.Qualification;
import com.project.model.Student;
import com.project.util.HibernateUtil;

public class HibernateAnnonationMain {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setStudent_id(10001);
		student1.setStudent_name("Siva Karthick");
//		
		Qualification qualification=new Qualification();
		qualification.setQualification("BE");
//		
		student1.setQualification(qualification);
		student1.setAge(25);
		Date today= new Date(System.currentTimeMillis());
		student1.setDob(today);
		student1.setMobile(919191919);
//		
		City city=new City();
//		
		city.setCity("Gudalur");
		
		student1.setCity(city);
		student1.setAttendance(3);
		
		Session session= HibernateUtil.getannotationSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.persist(student1);
		session.getTransaction().commit();
		System.out.println("Success");
		
		HibernateUtil.getannotationSessionFactory().close();
		
		
	}

}
