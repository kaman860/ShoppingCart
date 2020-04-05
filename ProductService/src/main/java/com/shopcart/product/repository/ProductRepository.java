package com.shopcart.product.repository;

import com.shopcart.product.repository.model.ProductDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductDocument,Long> {
		
}
