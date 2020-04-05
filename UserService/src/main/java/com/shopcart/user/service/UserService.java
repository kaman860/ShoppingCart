package com.shopcart.user.service;

import com.shopcart.user.repository.UserRepository;
import com.shopcart.user.helpers.NewUserHelper;
import com.shopcart.user.repository.model.UserDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    @Autowired
    NewUserHelper newUserHelper;

    public Optional<UserDocument> getUserDetails(String username){
        return repository.findById(username);
    }

    public UserDocument createUser(String username,String password ,String email){
        UserDocument newUser = newUserHelper.addUser(username, password, email);
        return repository.save(newUser);
    }
}
