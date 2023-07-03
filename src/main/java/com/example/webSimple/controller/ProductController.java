package com.example.webSimple.controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webSimple.entities.Product;
import com.example.webSimple.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public ResponseEntity<List<Product>> getObjects() {
		productService = new ProductService();
		List<Product> productList = productService.getAllProducts();
		return ResponseEntity.ok(productList);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) {
		return new ResponseEntity<Product>(productService.getProductById(id), HttpStatusCode.valueOf(200));
	}

	@PostMapping(path = "/add")
	public ResponseEntity<Product> createProduct(@RequestBody Product body) {
		productService.addProduct(body);
		return new ResponseEntity<Product>(body, HttpStatusCode.valueOf(200));
	}

	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<Product> deleteProductById(@PathVariable long id) throws Exception {
		System.out.println("deleting by id:" + id);
		Product product = null;
		try {
			product = productService.deleteProductById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<Product>(product, HttpStatusCode.valueOf(200));
	}
//
//	@PutMapping(path = "{id}")
//	public ResponseEntity<Product> put(@PathVariable int id) {
//		return new ResponseEntity<Product>(productService.deleteProductById(id), HttpStatusCode.valueOf(200));
//	}
//
//	@PatchMapping(path = "{id}")
//	public ResponseEntity<Product> patch(@PathVariable int id) {
//		return new ResponseEntity<Product>(productService.deleteProductById(id), HttpStatusCode.valueOf(200));
//	}
}
