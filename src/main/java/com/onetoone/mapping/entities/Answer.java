package com.onetoone.mapping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	private int ansId ;
	private String answer ;
	
	@OneToOne(mappedBy = "answer")
	private Question question ;
	
	public Answer(int ansId, String answer) {
		super();
		this.ansId = ansId;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	

}
