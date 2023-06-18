package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repository.ProductRepository;
import com.example.webSimple.entities.Product;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	public ProductService() {
		productRepository = new ProductRepository();
	}
	
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public Product getProductById(int id) {
		return productRepository.getProductById(id);
	}

	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
	
	public void deleteProduct(Product product) {
		productRepository.removeProduct(product);
	}
	
	public void deleteProductById(int id) {
	}
}
