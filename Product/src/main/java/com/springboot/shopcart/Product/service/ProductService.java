package com.springboot.shopcart.Product.service;

import com.springboot.shopcart.Product.repository.ProductRepository;
import com.springboot.shopcart.Product.repository.model.ProductDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Iterable<ProductDocument> getProducts() {
        return repository.findAll();
    }

    public Optional<ProductDocument> getProduct(long id) {
        return repository.findById(id);
    }
}
