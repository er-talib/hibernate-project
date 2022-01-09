package com.onetomany.mapping.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	private int queId;
	private String question;

	@OneToMany(mappedBy = "question")
	private List<Answer> answers;

	

	public Question(int queId, String question, List<Answer> answers) {
		super();
		this.queId = queId;
		this.question = question;
		this.answers = answers;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
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

	

}