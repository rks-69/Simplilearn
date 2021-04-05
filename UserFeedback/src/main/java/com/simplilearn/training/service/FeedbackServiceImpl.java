package com.simplilearn.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.training.model.Feedback;
import com.simplilearn.training.repository.FeedbackRepository;

@Service(value = "feedbackService")
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	@Transactional
	public Feedback saveFeedbakc(Feedback feedback) {
		return feedbackRepository.save(feedback);
	}

	@Override
	@Transactional
	public List<Feedback> getFeedbacks() {
		return feedbackRepository.findAll();
	}

}
