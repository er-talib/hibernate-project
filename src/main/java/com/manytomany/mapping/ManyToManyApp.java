package com.manytomany.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.manytomany.mapping.entities.Emp;
import com.manytomany.mapping.entities.Project;


public class ManyToManyApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/manytomany/mapping/hibernate.cfg.xml").buildSessionFactory();
	
		Emp emp = new Emp();
		emp.seteId(113);
		emp.seteName("Talib");
		
		Emp emp2 = new Emp();
		emp2.seteId(114);
		emp2.seteName("Aleem");
		
		
		Project pro = new Project();
		pro.setProId(445);
		pro.setProName("SBM");
		
		Project pro2 = new Project();
		pro2.setProId(456);
		pro2.setProName("ODF");
		
		List<Emp> list1 = new ArrayList<Emp>();
		list1.add(emp);
		list1.add(emp2);
//		
		List<Project> list2 = new ArrayList<Project>();
		list2.add(pro);
		list2.add(pro2);
		
		emp.setProject(list2);
		pro.setEmp(list1);
		
		emp2.setProject(list2);
		pro2.setEmp(list1);
		
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(pro);
		session.save(pro2);
		session.save(emp);
		session.save(emp2);
		
		transaction.commit();
		
		session.close();
		factory.close();
		
	
	}
}
