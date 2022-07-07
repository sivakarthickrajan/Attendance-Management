package com.project.util;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.project.model.City;
import com.project.model.Employee;
import com.project.model.Gender;
import com.project.model.Qualification;
import com.project.model.Student;




public class HibernateUtil {
		private static SessionFactory annotationSessionFactory;
		
		 public static SessionFactory buildSessionAnnotationFactory() {
			 Configuration configuration= new Configuration();
				configuration.configure("Hibernate-annotation.cfg.xml"); 
				configuration.addAnnotatedClass(Student.class);
				configuration.addAnnotatedClass(City.class);
				configuration.addAnnotatedClass(Qualification.class);
				configuration.addAnnotatedClass(Gender.class);
				configuration.addAnnotatedClass(Employee.class);
				
	
				System.out.println("Hibernate configuration loaded Successfully");
				
				ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				
				SessionFactory sessionFactory= configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory;
			 
				
		 }
		 public static SessionFactory getannotationSessionFactory() {
			 if(annotationSessionFactory==null)annotationSessionFactory=buildSessionAnnotationFactory();
			 return annotationSessionFactory;
		 }
}
