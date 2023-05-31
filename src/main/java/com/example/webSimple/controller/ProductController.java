package com.example.webSimple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webSimple.entities.Department;
import com.example.webSimple.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@GetMapping(path = "/department")
	public Product getObjects() {
		Department d1 = new Department(1,"Tech");
		Department d2 = new Department(1,"Pet");
		
		Product p1 = new Product(1,"macbook",4000,d1);
		var p2 = new Product(2,"macbook pro",5000,d1);
		Product p3 = new Product(3,"pet house",300,d2);
		
		return p1;
	}

}
