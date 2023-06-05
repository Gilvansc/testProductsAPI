package com.example.webSimple.controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.webSimple.entities.Product;
import com.example.webSimple.entities.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@GetMapping
	public ResponseEntity<List> getObjects() {
		List<Product> productList = ProductService.getAllProducts();
		return ResponseEntity.ok(productList);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) { 
		 return new ResponseEntity<Product>(ProductService.getProductById(id),HttpStatusCode.valueOf(200));
	}
}
