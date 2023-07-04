package com.example.service;

import com.example.webSimple.entities.Product;
import com.example.webSimple.service.ProductService;

public class ProductServiceTest {
	private ProductService productService = new ProductService();

	private boolean shouldThrowExceptionWhenProductByIdNotFound() {
		try {
			productService.getProductById(421422);
			System.out.println("shouldThrowExceptionWhenProductByIdNotFound: failed");
			return false;
		} catch (Exception e) {
			System.out.println("shouldThrowExceptionWhenProductByIdNotFound: passed");
			return true;
		}
	}

	private boolean test2() {
		return true;
	}

	public static void main(String[] args) {
		ProductServiceTest productServiceTest = new ProductServiceTest();
		productServiceTest.productService.addProduct(new Product(1, null, 0, null));
		if (productServiceTest.shouldThrowExceptionWhenProductByIdNotFound() & productServiceTest.test2()) {
			System.out.println("\n---all tests passed---");
		} else {
			System.out.println("---tests failed---");
		}
	}
}
