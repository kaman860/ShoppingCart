package com.springboot.shopcart.Product.repository;

import com.springboot.shopcart.Product.repository.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,Long> {
		
}
