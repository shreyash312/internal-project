package com.axis.service;

import java.util.List;

import com.axis.model.User;



public interface UserService {

	User addUser(User user);
	
	List<User> getAllUser();
	
	User getUserById(int id);
	
	User updateUserById(int id,User user);
	
	String deleteUserById(int id);
	
	
}
