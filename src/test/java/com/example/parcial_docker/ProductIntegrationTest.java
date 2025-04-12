package com.example.parcial_docker;

import com.example.parcial_docker.model.Product;
import com.example.parcial_docker.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*; 

@SpringBootTest
public class ProductIntegrationTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testSaveAndFindProduct() {
        Product product = new Product("Monitor", 300.0, 20);
        Product saved = productRepository.save(product);

        Product found = productRepository.findById(saved.getId()).orElse(null);

        assertNotNull(found);
        assertEquals("Monitor", found.getName());
        assertEquals(300.0, found.getPrice());
        assertEquals(20, found.getStock());
    }
}
