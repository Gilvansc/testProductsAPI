package com.example.webSimple;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.webSimple.entities.Department;
import com.example.webSimple.entities.Product;

@SpringBootApplication
public class WebSimpleApplication {
	public static List<Product> productList;
	public static void main(String[] args) {
		Department d1 = new Department(1,"Tech");
		Department d2 = new Department(1,"Pet");
		
		Product p1 = new Product(1,"macbook",4000,d1);
		Product p2 = new Product(2,"macbook pro",5000,d1);
		Product p3 = new Product(3,"pet house",300,d2);
		productList=Arrays.asList(p1,p2,p3);
		
		SpringApplication.run(WebSimpleApplication.class, args);
	}
	
}
