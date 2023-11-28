package com.example.SpringwithEs.controller;

import com.example.SpringwithEs.entity.Product;
import com.example.SpringwithEs.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class ProductController {

    @Autowired
    private ProductServiceImpl productServiceimpl;

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return productServiceimpl.getAllProducts();
    }

    @PostMapping("/insert")
    public Product insertProduct(@RequestBody Product product) {
        return  productServiceimpl.insertProduct(product);
    }
}
