package com.example.webSimple.service;

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

	public Product getProductById(int id) throws Exception {
		// if null TODO
		Product product=productRepository.getProductById(id);
		if (product==null) {
			throw new Exception("Product not found for ID:"+id);
		}
		return product;
	}

	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}

	public void deleteProduct(Product product) {
//		TODO if product doesnt exists
		productRepository.removeProduct(product);
	}

	public void deleteProductById(int id) {
//		TODO if id not found
		productRepository.removeProduct(id);
	}
}
