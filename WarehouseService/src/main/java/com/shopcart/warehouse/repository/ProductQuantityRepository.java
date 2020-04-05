package com.shopcart.warehouse.repository;

import com.shopcart.warehouse.repository.model.ProductQuantityDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductQuantityRepository extends MongoRepository<ProductQuantityDocument, Long> {

}
