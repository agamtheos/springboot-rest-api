package com.springboot.springbootrestapi.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.springbootrestapi.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);
}