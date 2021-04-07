package com.simplilearn.training.service;

import java.util.List;

import com.simplilearn.training.model.User;

public interface UserService {
	public List<User> getUsers();
	public User saveUser(User user);

}
