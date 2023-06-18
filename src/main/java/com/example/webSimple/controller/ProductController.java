package com.example.webSimple.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ProductService;
import com.example.webSimple.entities.Department;
import com.example.webSimple.entities.Product;

import ch.qos.logback.core.testUtil.RandomUtil;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	ProductService productService;

	@GetMapping
	public ResponseEntity<List> getObjects() {
		productService = new ProductService();
		List<Product> productList = productService.getAllProducts();
		System.out.println("a");
		return ResponseEntity.ok(productList);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) {
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatusCode.valueOf(200));
	}

	@PutMapping(path = "/add")
	public ResponseEntity<Product> createProduct(@RequestBody int id, @RequestBody String name,
			@RequestBody double price, @RequestBody String department) {
		System.out.println(id);
		return new ResponseEntity<Product>(new Product(id, name, 4000, new Department(RandomUtil.getPositiveInt(), department)),HttpStatusCode.valueOf(200));
	}
}
