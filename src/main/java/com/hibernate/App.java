package com.hibernate;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entities.Address;
import com.hibernate.entities.Students;

import net.bytebuddy.implementation.bytecode.Addition;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Project Start");

		SessionFactory factory = new Configuration().configure("com/hibernate/hibernate.cfg.xml").buildSessionFactory();

		///For student class
		Students st = new Students();
		st.setId(103);
		st.setStuName("Aleem");
		st.setStuCity("Hapur");
		st.setPhone("9928345671");
		
		
		//for Address class
		
		Address ad = new Address();
		
		ad.setStreetName(" Market street");
		ad.setLandMark("Near mosque  sweets");
		ad.setOpen(true);
		ad.setNothing(1234.22);
		ad.setDataSaveDate(new Date());
		
		// add image in database 
		FileInputStream fis = new FileInputStream("src/main/java/smart-home-image.jpg");
		byte[] image = new byte[fis.available()];
		fis.read(image);
		ad.setImage(image);
		
	

		Session session = factory.openSession();
		Transaction beginTransaction = session.beginTransaction();
		session.save(st);
		session.save(ad);

		beginTransaction.commit();

		session.close();
	}
}
