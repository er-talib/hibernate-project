package com.manytomany.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.manytomany.mapping.entities.Emp;
import com.manytomany.mapping.entities.Project;


public class FatchData {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/manytomany/mapping/hibernate.cfg.xml").buildSessionFactory();
	
		Session se = factory.openSession();
	
		Emp emp = (Emp)se.get(Emp.class, 113);
		System.out.println(emp.geteName() +"  "+ emp.geteId());
		
//		Project pr = se.get(Project.class, 445);
//		
//		for(Emp e : pr.getEmp()) {
//			System.out.println(e.geteName() + " " + e.geteId());
//			
//		}
		
		
		
		for(Project p : emp.getProject()) {
			System.out.println(p.getProName() + " "+ p.getProId());
		}
		
		se.close();
		factory.close();
	
	}

}
