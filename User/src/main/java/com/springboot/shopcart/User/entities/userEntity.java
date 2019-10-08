package com.springboot.shopcart.User.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class userEntity {
	@Id
	public String username;
	public String password;
	public String emailId;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
