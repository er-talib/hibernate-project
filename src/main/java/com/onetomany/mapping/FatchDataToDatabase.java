package com.onetomany.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.mapping.entities.Answer;
import com.onetomany.mapping.entities.Question;

public class FatchDataToDatabase {
	
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/onetomany/mapping/hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		
		Question q = (Question)session.get(Question.class, 126);
		System.out.println(q.getQuestion());
		
		for(Answer a : q.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		
		
		
		session.close();
		factory.close();
		
	}

}
