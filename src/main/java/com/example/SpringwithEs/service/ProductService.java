package com.example.SpringwithEs.service;

import com.example.SpringwithEs.entity.Product;

public interface ProductService {
    Iterable<Product> getAllProducts();

    Product insertProduct(Product product);
}
