package com.onetoone.mapping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	@Id
	private int queId ;
	private String question ;
	
	@OneToOne
	@JoinColumn(name="QA_Id")
	private Answer answer;

	public Question(int queId, String question, Answer answer) {
		super();
		this.queId = queId;
		this.question = question;
		this.answer = answer;
	}

	public Question() {
		
	}

	public int getQueId() {
		return queId;
	}

	public void setQueId(int queId) {
		this.queId = queId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	
	
	
	

}
