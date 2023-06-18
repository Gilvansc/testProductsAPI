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

	public Product getProductById(long id) {
		// if null TODO
		return productRepository.getProductById(id);
	}

	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}

	public Product deleteProduct(Product product) {
		long id = product.getId();
		if (productRepository.productExists(id)) {
			productRepository.removeProduct(id);
			return getProductById(id);
		}
		return null;
	}

	public Product deleteProductById(long id) {
		if (productRepository.productExists(id)) {
			Product product = productRepository.getProductById(id);
			productRepository.removeProduct(product);
			return product;
		}
		return null;

	}
}
