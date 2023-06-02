package com.example.webSimple.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webSimple.WebSimpleApplication;
import com.example.webSimple.entities.Department;
import com.example.webSimple.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	List<Product> productList = WebSimpleApplication.productList;
	
	@GetMapping
	public ResponseEntity<List> getObjects() {	
		return ResponseEntity.ok(productList);
	}
	
	@GetMapping(path = "/{id}")
	public void getProductById(){
		
	}
	
}
