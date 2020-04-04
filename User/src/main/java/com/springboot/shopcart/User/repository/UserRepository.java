package com.springboot.shopcart.User.repository;

import com.springboot.shopcart.User.repository.model.UserDocument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDocument, String> {

}
