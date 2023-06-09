package com.example.webSimple.controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webSimple.entities.Product;
import com.example.webSimple.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public ResponseEntity<List<Product>> getObjects() {
		productService = new ProductService();
		List<Product> productList = productService.getAllProducts();
		return ResponseEntity.ok(productList);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) {
		Product product;
		try {
			product=productService.getProductById(id);
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(product);		
	}
}
