package com.shopcart.user.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDocument {
	public String username;
	public String password;
	public String emailId;

}
