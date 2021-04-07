package com.simplilearn.training.service;

import java.util.List;

import com.simplilearn.training.model.Product;

public interface ProductService {
	public List<Product> getProducts();
	public Product saveProduct(Product product);
	public Product getProduct(Integer id);
	public void deleteProduct(Integer id);

}
