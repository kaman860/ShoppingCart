package com.springboot.shopcart.Product.repository;

import com.springboot.shopcart.Product.repository.model.ProductDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductDocument,Long> {
		
}
