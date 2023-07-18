package com.example.webSimple.service;

import com.example.repository.ProductRepository;
import com.example.webSimple.entities.Department;
import com.example.webSimple.entities.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceTest {
    public static final Product PRODUCT = new Product(1, "produto teste", 2, new Department(1, "departamento teste"));
    private ProductService productService;
    private ProductRepository productRepository;

    @BeforeEach
    void setup() {
        this.productRepository = mock(ProductRepository.class);
        this.productService = new ProductService(productRepository);
    }

    @Test
    public void shouldGetAllProducts() {
        when(productRepository.getAllProducts()).thenReturn(List.of(PRODUCT,PRODUCT));

        List<Product> productServiceResponse = productService.getAllProducts();

        assertEquals(PRODUCT, productServiceResponse.get(1));
    }

    @Test
    public void shouldFindProductById() {
        when(productRepository.getProductById(1)).thenReturn(PRODUCT);

        Product productServiceResponse = productService.getProductById(1);

        assertEquals(PRODUCT, productServiceResponse);
    }

    @Test
    public void shouldThrowExceptionWhenProductByIdNotFound() {
        when(productRepository.getProductById(anyInt())).thenThrow(RuntimeException.class);

        assertThrows(RuntimeException.class, () -> productService.getProductById(2));
    }

    @Test
    public void shouldAddProduct() {
        List.of(PRODUCT,PRODUCT);

        List<Product> productServiceResponse = productService.getAllProducts();

        assertEquals(PRODUCT, productServiceResponse.get(1));
    }


}
