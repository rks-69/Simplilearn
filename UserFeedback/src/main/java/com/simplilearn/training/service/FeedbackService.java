package com.simplilearn.training.service;

import java.util.List;

import com.simplilearn.training.model.Feedback;

public interface FeedbackService {
	
	public List<Feedback> getFeedbacks();
	public Feedback saveFeedbakc(Feedback feedback);

}
