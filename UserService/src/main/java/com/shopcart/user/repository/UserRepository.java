package com.shopcart.user.repository;

import com.shopcart.user.repository.model.UserDocument;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDocument, String> {

}
