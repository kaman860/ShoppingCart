package com.springboot.shopcart.User.Helpers;

import com.springboot.shopcart.User.entities.userEntity;

public class addNewUserHelper {
	
	public userEntity addUser(String username , String password, String email) {
		userEntity newUser = new userEntity();
		newUser.setUsername(username);
		newUser.setPassword(password);
		newUser.setEmailId(email);
		return newUser;
	}
}
