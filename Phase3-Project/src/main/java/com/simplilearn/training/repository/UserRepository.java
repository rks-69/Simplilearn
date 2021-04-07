package com.simplilearn.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.training.model.User;

@Repository(value = "userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

}
