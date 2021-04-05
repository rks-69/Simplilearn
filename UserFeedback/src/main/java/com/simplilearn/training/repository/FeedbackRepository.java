package com.simplilearn.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.training.model.Feedback;

@Repository(value = "feedbackRepository")
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
