package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.webSimple.entities.Product;

@Repository
public class ProductRepository {
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
	
	public static void removeProduct(Product product) {
        products.remove(product);
    }
	public static void removeProduct(int id) {
        products.remove(id);
    }

	

}
