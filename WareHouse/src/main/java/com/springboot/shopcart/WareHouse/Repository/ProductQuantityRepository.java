package com.springboot.shopcart.WareHouse.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.shopcart.WareHouse.Entities.ProductQuantity;

public interface ProductQuantityRepository extends CrudRepository<ProductQuantity, Long> {

}
