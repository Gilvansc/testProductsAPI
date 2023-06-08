package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.repository.ProductRepository;
import com.example.webSimple.entities.Product;

@Service
public class ProductService {
	
	public ProductService() {
		
	}
	
	public static List<Product> getAllProducts() {
		return ProductRepository.getAllProducts();
	}

	public static Product getProductById(int id) {
		return ProductRepository.getProductById(id);
	}

	public static void addProduct(Product product) {
		ProductRepository.addProduct(product);
	}
	
	public static void deleteProduct(Product product) {
		ProductRepository.removeProduct(product);
	}
	
	public static void deleteProductById(int id) {
		ProductRepository.removeProduct(id);
	}
}