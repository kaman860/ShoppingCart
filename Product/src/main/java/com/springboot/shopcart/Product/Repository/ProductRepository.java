package com.springboot.shopcart.Product.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.shopcart.Product.Entity.Product;;

public interface ProductRepository extends CrudRepository<Product,Long> {
		
}
