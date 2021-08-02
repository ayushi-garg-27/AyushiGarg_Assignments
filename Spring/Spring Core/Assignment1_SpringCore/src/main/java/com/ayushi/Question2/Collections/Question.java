package com.ayushi.Question2.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	private List<String> answers;
	private Set<String> answers1;
	private Map<Integer, String> answers2;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Set<String> getAnswers1() {
		return answers1;
	}
	public void setAnswers1(Set<String> answers1) {
		this.answers1 = answers1;
	}
	public Map<Integer, String> getAnswers2() {
		return answers2;
	}
	public void setAnswers2(Map<Integer, String> answers2) {
		this.answers2 = answers2;
	}
	public Question(int questionId, String question, List<String> answers, Set<String> answers1,
			Map<Integer, String> answers2) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		this.answers1 = answers1;
		this.answers2 = answers2;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
