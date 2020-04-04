package com.springboot.shopcart.WareHouse.repository;

import com.springboot.shopcart.WareHouse.repository.model.ProductQuantityDocument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductQuantityRepository extends CrudRepository<ProductQuantityDocument, Long> {

}
