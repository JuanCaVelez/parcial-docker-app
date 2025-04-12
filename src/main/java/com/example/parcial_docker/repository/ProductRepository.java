package com.example.parcial_docker.repository;

import com.example.parcial_docker.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // No additional methods are needed for basic CRUD operations
}