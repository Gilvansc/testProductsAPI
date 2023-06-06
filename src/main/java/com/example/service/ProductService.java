package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repository.ProductRepository;
import com.example.webSimple.entities.Product;

@Service
public class ProductService {

	public List<Product> getAllProducts() {
		return ProductRepository.getAllProducts();
	}

	public Product getProductById(int id) {
		return ProductRepository.getProductById(id);
	}

	public void addProduct(Product product) {
		ProductRepository.addProduct(product);
	}
	
	public void deleteProduct(Product product) {
		ProductRepository.removeProduct(product);
	}
	
	public void deleteProductById(int id) {
		ProductRepository.removeProduct(id);
	}
}