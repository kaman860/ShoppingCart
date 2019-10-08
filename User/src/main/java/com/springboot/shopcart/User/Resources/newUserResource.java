package com.springboot.shopcart.User.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.shopcart.User.Repository.UserRepository;
import com.springboot.shopcart.User.entities.userEntity;

@RestController
@RequestMapping("/new/{username}")
public class newUserResource {
	
	@Autowired
	UserRepository repository;
	
	@PostMapping
	public userEntity createUser(@RequestParam String password , @RequestParam String email){
		userEntity newUser = new userEntity();
		return repository.save(newUser);
	}
	
}
