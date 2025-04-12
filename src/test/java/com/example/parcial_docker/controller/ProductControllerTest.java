package com.example.parcial_docker.controller;

import com.example.parcial_docker.model.Product;
import com.example.parcial_docker.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @Test
    public void testGetProductById() {
        Product product = new Product("Laptop", 1200.0, 10);

        when(productService.getProductById(1L)).thenReturn(Optional.of(product));

        Optional<Product> result = productController.getProductById(1L);
        assertTrue(result.isPresent());
        assertEquals("Laptop", result.get().getName());
    }
}
