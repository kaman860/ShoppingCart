package com.shopcart.user.helpers;

import com.shopcart.user.repository.model.UserDocument;
import org.springframework.stereotype.Component;

@Component
public class NewUserHelper {
	
	public UserDocument addUser(String username , String password, String email) {
		UserDocument newUser = new UserDocument();
		newUser.setUsername(username);
		newUser.setPassword(password);
		newUser.setEmailId(email);
		return newUser;
	}
}
