package com.onetoone.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoone.mapping.entities.Answer;
import com.onetoone.mapping.entities.Question;

public class MapingApp {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("com/onetoone/mapping/hibernate.cfg.xml")
				.buildSessionFactory();

		Question ques = new Question();
		ques.setQueId(126);
		ques.setQuestion("What is oops");
		Answer ans = new Answer();
		ans.setAnsId(678);
		ans.setAnswer("Oops is a object oriented programs");

		ques.setAnswer(ans);

		Question ques2 = new Question();
		ques2.setQueId(111);
		ques2.setQuestion("What is Spring boot");
		Answer ans2 = new Answer();
		ans2.setAnsId(112);
		ans2.setAnswer("Spring boot  is a sud framwork of spring");

		ques2.setAnswer(ans2);

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ques);
		session.save(ans);
		session.save(ques2);
		session.save(ans2);
		
		
		///// faching data
		Question question = (Question)session.get(Question.class, 125);
		System.out.println(question.getQuestion());
		System.out.println(question.getAnswer().getAnswer()
				);

		transaction.commit();
		session.close();
		factory.close();
	}

}
