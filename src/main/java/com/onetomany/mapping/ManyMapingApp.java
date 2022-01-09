package com.onetomany.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.mapping.entities.Answer;
import com.onetomany.mapping.entities.Question;

public class ManyMapingApp {
	public static void main(String[] args) {
		
		
		SessionFactory factory = new Configuration().configure("com/onetomany/mapping/hibernate.cfg.xml")
				.buildSessionFactory();

		///First Question
		Question ques = new Question();
		ques.setQueId(227);
		ques.setQuestion("What is oops");
		
		Answer ans = new Answer();
		ans.setAnsId(778);
		ans.setAnswer("Oops is a object oriented programs");
        ans.setQuestion(ques);
        
        Answer ans2 = new Answer();
		ans2.setAnsId(723);
		ans2.setAnswer("Oops is very important pary of java");
        ans2.setQuestion(ques);
        
        Answer ans3 = new Answer();
		ans3.setAnsId(790);
		ans3.setAnswer("Oops is multitasking ");
        ans3.setQuestion(ques);

		List<Answer> list = new ArrayList<Answer>();
		list.add(ans);
		list.add(ans2);
		list.add(ans3);
		
		ques.setAnswers(list);
		
		
		
		//second question 
		
		Question ques2 = new Question();
		ques2.setQueId(012);
		ques2.setQuestion("What is java");
		
		Answer answ1 = new Answer();
		answ1.setAnsId(234);
		answ1.setAnswer("Java is programing language");
		answ1.setQuestion(ques2);
		
		Answer answ2 = new Answer();
		answ2.setAnsId(256);
		answ2.setAnswer("Java is oops based language");
		answ2.setQuestion(ques2);
		
		
		List<Answer> list2 = new ArrayList<Answer>();
		list2.add(answ1);
		list2.add(answ2);
		
		
		ques2.setAnswers(list2);
		

	

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		//save first question and answer
		session.save(ques);
		session.save(ans);
		session.save(ans2);
		session.save(ans3);
		
		//save second question and answer
		session.save(ques2);
		session.save(answ1);
		session.save(answ2);
		
		transaction.commit();
		session.close();
		factory.close();
	}

}
