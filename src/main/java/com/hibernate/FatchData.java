package com.hibernate;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Address;
import com.hibernate.entities.Students;

public class FatchData {
	
	public static void main(String[] args) {
		
	

	SessionFactory factory = new Configuration().configure("com/hibernate/hibernate.cfg.xml").buildSessionFactory();
	
	Session session = factory.openSession();
	
	
	//for student  object 
	Students stu = session.get(Students.class, 103);
	System.out.println(stu);

	
	
	//Print Address object 
//	Address add = (Address)session.load(Address.class, 1);
//	
//	System.out.println(add);
	
	session.close();
	factory.close();
	}
}
