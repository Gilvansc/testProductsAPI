package com.example.webSimple.service;

import com.example.repository.ProductRepository;
import com.example.webSimple.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public Product getProductById(int id) throws RuntimeException {
        Product product = productRepository.getProductById(id);
        return product;
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public void deleteProduct(Product product) {
//		TODO if product doesnt exists
        productRepository.removeProduct(product);
    }

    public void deleteProductById(int id) {
//		TODO if id not found
        productRepository.removeProduct(id);
    }
}
