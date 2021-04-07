package com.simplilearn.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.training.model.Product;
import com.simplilearn.training.repository.ProductRepository;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	@Transactional
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Override
	@Transactional
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	@Transactional
	public Product getProduct(Integer id) {
		return productRepository.findById(id).get();
	}

	@Override
	@Transactional
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
		
	}

}
