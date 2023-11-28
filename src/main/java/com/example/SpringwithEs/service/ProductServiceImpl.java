package com.example.SpringwithEs.service;

import com.example.SpringwithEs.entity.Product;
import com.example.SpringwithEs.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepo productRepo;
    @Override
    public Iterable<Product> getAllProducts() {

        return productRepo.findAll();
    }
    @Override
    public Product insertProduct(Product product) {

        return productRepo.save(product);
    }
}
