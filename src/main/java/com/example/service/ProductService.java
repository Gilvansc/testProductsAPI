package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.ProductRepository;
import com.example.webSimple.entities.Product;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	@Autowired
	public ProductService() {
		productRepository = new ProductRepository();
	}

	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public Product getProductById(int id) {
		// if null TODO
		return productRepository.getProductById(id);
	}

	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}

	public void deleteProduct(Product product) {
//		TODO if product doesnt exists
		productRepository.removeProduct(product);
	}

	public void deleteProductById(int id) {
	}
}
