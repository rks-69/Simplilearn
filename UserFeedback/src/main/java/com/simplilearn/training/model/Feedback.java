package com.simplilearn.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String feedback;
//	public int getId() {
//		return id;
//	}
////	public void setId(int id) {
////		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public Feedback(int id, String name, String feedback) {
		super();
		this.id = id;
		this.name = name;
		this.feedback = feedback;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return String.format("Feedback [id=%s, name=%s, feedback=%s]", id, name, feedback);
	}
	

}
