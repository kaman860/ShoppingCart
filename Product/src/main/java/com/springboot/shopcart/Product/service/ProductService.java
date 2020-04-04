package com.springboot.shopcart.Product.service;

import com.springboot.shopcart.Product.repository.ProductRepository;
import com.springboot.shopcart.Product.repository.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Iterable<Product> getProducts() {
        return repository.findAll();
    }

    public Optional<Product> getProduct(long id) {
        return repository.findById(id);
    };
}
