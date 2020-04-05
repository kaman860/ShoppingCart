package com.shopcart.user.resource;

import com.shopcart.user.repository.model.UserDocument;
import com.shopcart.user.service.UserService;
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
