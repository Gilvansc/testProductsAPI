package com.example.webSimple.entities;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
	private static List<Product> products=new ArrayList<>();

	public static List<Product> getAllProducts() {
		return products;
	}

	public static Product getProductById(int id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	public static void addProduct(Product product) {
		products.add(product);
	}

}
