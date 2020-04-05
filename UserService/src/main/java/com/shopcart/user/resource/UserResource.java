package com.shopcart.user.resource;

import com.shopcart.user.repository.model.UserDocument;
import com.shopcart.user.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user/{username}")
public class UserResource {
	
	@Autowired
	UserService userService;
	
	@ApiOperation(value = "Get User deatils" , response = UserDocument.class , tags = "User Service")
	@GetMapping
	public Optional<UserDocument> getUserDetails(@PathVariable("username") String username){
		return userService.getUserDetails(username);
	}
	
}
