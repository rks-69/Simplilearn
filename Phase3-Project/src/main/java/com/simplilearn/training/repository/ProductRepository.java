package com.simplilearn.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.training.model.Product;

@Repository(value = "productRepository")
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
