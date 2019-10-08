package com.springboot.shopcart.User.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.shopcart.User.Helpers.NewUserHelper;
import com.springboot.shopcart.User.Repository.UserRepository;
import com.springboot.shopcart.User.entities.userEntity;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user/new/{username}")
public class newUserResource {
	
	@Autowired
	UserRepository repository;
	
	
	@ApiOperation(value = "Create a new user", response = userEntity.class , tags = "User Service")
	@PostMapping
	public userEntity createUser(@PathVariable("username") String username, @RequestParam String password , @RequestParam String email){
		NewUserHelper helper = new NewUserHelper();
		userEntity newUser = helper.addUser(username, password, email);
		return repository.save(newUser);
	}
	
}
