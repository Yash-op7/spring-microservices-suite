package com.yash95.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yash95.product_service.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
}
