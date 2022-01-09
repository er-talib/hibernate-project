package com.Embadded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Embadded.entities.Certificate;
import com.Embadded.entities.Student;
import com.hibernate.entities.Students;

public class EmbaddedApp {

	public static void main(String[] args) {
		
		SessionFactory  factory = new Configuration().configure("com/Embadded/hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student stu = new Student();
		stu.setStuId(112);
		stu.setStuName("Muhammad");
		stu.setStuCity("Bulandshar");
		Certificate certificate = new Certificate();
		certificate.setCourst("Hibernate");
		certificate.setDuration("3 month");
		stu.setCert(certificate);
		
		session.save(stu);
		
		
		// second students
		Student stu1 = new Student();
		stu1.setStuId(111);
		stu1.setStuName("Talib");
		stu1.setStuCity("Ghaziabad");
		Certificate certificate1 = new Certificate();
		certificate1.setCourst("Spring Boot");
		certificate1.setDuration("9 month");
		stu1.setCert(certificate1);
		
		session.save(stu1);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
