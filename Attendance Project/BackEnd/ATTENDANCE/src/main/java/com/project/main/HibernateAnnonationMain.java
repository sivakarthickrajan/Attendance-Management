package com.project.main;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.project.model.City;
import com.project.model.Employee;
import com.project.model.Gender;
import com.project.model.Qualification;
import com.project.model.Student;
import com.project.util.HibernateUtil;

public class HibernateAnnonationMain {

	public static void main(String[] args) {
			
		
		Gender male= new Gender();
		male.setId(1);
		male.setGender("Male");
		
		Gender female = new Gender();
		female.setId(2);
		female.setGender("Female");
		
		Qualification be= new Qualification();
		be.setQualification_id(1);
		be.setQualification("B.E- CSE");
		
		City city=new City();
		city.setCity_id(1);
		city.setCity("Gudalur");
		
		
		
		Employee emp1=new Employee();
		
		
		emp1.setId(1);
		emp1.setName("Siva");
		emp1.setGender(male);
		emp1.setQualification(be);
		emp1.setMobile(9345091);
		emp1.setNo_of_stu_handiling(3);
		emp1.setCity(city);
		
		
		
		Session session= HibernateUtil.getannotationSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.persist(emp1);
		session.getTransaction().commit();
		System.out.println("Success");
		
		HibernateUtil.getannotationSessionFactory().close();
		
		
	}

}
