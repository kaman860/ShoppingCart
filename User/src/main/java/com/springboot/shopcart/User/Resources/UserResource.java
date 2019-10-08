package com.springboot.shopcart.User.Resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.shopcart.User.Repository.UserRepository;
import com.springboot.shopcart.User.entities.userEntity;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user/{username}")
public class UserResource {
	
	@Autowired
	UserRepository repository;
	
	@ApiOperation(value = "Get User deatils" , response = userEntity.class , tags = "User Service")
	@GetMapping
	public Optional<userEntity> baba(@PathVariable("username") String username){
		return repository.findById(username);
	}
	
}
