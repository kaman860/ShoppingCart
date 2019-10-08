package com.springboot.shopcart.User.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.shopcart.User.entities.userEntity;

public interface UserRepository extends CrudRepository<userEntity , String> {

}
