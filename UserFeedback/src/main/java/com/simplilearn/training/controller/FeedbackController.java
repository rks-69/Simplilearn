package com.simplilearn.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.training.model.Feedback;
import com.simplilearn.training.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		mav.addObject("feedbacks", new Feedback());
		return mav;
	}
	
	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute("feedbacks") Feedback feedback) {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("success");
		feedbackService.saveFeedbakc(feedback);
		return mav;
	}

}
