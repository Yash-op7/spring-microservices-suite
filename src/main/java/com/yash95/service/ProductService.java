package com.yash95.service;

import org.springframework.stereotype.Service;

import com.yash95.product_service.dto.ProductRequest;
import com.yash95.product_service.model.Product;
import com.yash95.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
        .name(productRequest.getName())
        .description(productRequest.getDescription())
        .price(productRequest.getPrice())
        .build();

        productRepository.save(product);
        log.info("Product with id {} is saved.", product.getId());
    }
}
