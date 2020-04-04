package com.springboot.shopcart.User.resource;

import com.springboot.shopcart.User.repository.model.UserDocument;
import com.springboot.shopcart.User.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/new/{username}")
public class NewUserResource {

	@Autowired
	UserService userService;
	
	@ApiOperation(value = "Create a new user", response = UserDocument.class , tags = "User Service")
	@PostMapping
	public UserDocument createUser(@PathVariable("username") String username, @RequestParam String password , @RequestParam String email){
		return userService.createUser(username , password , email);
	}
	
}
