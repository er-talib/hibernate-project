package com.Cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Cascading.entities.StudentDetail;
import com.Cascading.entities.Address;

public class CascadingApp {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/Cascading/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		StudentDetail sd = new StudentDetail();
		sd.setStuId(123);
		sd.setStuName("Muhammad Talib");
		
		Address ad = new Address();
		ad.setAreaName("GovindPuram ");
		ad.setAredId(345);
		ad.setStudentDetail(sd);
		
		Address ad1 = new Address();
		ad1.setAreaName("Noida ");
		ad1.setAredId(367);
		ad1.setStudentDetail(sd);
		
		Address ad2 = new Address();
		ad2.setAreaName("Delhi");
		ad2.setAredId(378);
		ad2.setStudentDetail(sd);
		
		List<Address> list = new ArrayList<Address>();
		list.add(ad);
		list.add(ad1);
		list.add(ad2);
		
		sd.setAddreses(list);
		
		
		Transaction transaction = session.beginTransaction();
		
		session.save(sd);
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
