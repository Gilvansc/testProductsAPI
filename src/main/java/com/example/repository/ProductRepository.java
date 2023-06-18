package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.webSimple.entities.Department;
import com.example.webSimple.entities.Product;

@Repository
public class ProductRepository {
	private static List<Product> products = new ArrayList<>();

	public List<Product> getAllProducts() {
		if (products.isEmpty()) {
			products.add(new Product(1, "macbook", 4000, new Department(1, "Tech")));
			products.add(new Product(3, "pet house", 300, new Department(2, "Pet")));
		}

		return products;
	}

	public Product getProductById(long id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	public void addProduct(Product product) {
		products.add(product);
		System.out.printf("added " + product.getName());
	}

	public void removeProduct(long id) {
		products.remove(getProductById(id));
//		System.out.printf("%s removed \n", getProductById(id));
	}

	public void removeProduct(Product product) {
		products.remove(product);
//		System.out.printf("%s removed \n", product.getName());
	}

	public boolean productExists(long id) {
		if (getProductById(id).equals(null)) {
			return false;
		}
		return true;
	}

	public boolean productExists(Product product) {
		if (!getProductById(product.getId()).equals(null)) {
			return false;
		}
		return true;
	}
}
