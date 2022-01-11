package com.Cascading;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Cascading.entities.Address;
import com.Cascading.entities.StudentDetail;

public class CascadingFatchDataApp {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/Cascading/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		StudentDetail sd = session.get(StudentDetail.class, 123);
		
		System.out.println(sd.getStuId() + "\n" + sd.getStuName() );
		
		List<Address> list = sd.getAddreses();
		
		for(Address add : list) {
			System.out.println(add.getAreaName() + ":" + add.getAredId());
		}
		
		
		
		
		
		session.close();
		factory.close();
	}

}
