package com.example.webSimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.webSimple.entities.Department;
import com.example.webSimple.entities.Product;

@SpringBootApplication
public class WebSimpleApplication {
	public static void main(String[] args) {
		
		Department d1 = new Department(1,"Tech");
		Department d2 = new Department(1,"Pet");
		
		new Product(1,"macbook",4000,d1);
		new Product(2,"macbook pro",5000,d1);
		new Product(3,"pet house",300,d2);
		
		SpringApplication.run(WebSimpleApplication.class, args);
	}
	
}
