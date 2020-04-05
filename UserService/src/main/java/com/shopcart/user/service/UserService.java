package com.shopcart.user.service;

import com.shopcart.user.repository.UserRepository;
import com.shopcart.user.repository.model.UserDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public UserDocument getUserDetails(String username) {
        return repository.findById(username).orElseThrow(
                () -> new NoSuchElementException(username));
    }

    public UserDocument createUser(String username,String password ,String email){
        return repository.save(new UserDocument(username , password , email));
    }
}
