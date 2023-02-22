package com.job.portal.service;

import java.util.List;

import com.job.portal.model.User;

public interface UserService {
	
	public User createUser(User user);
	public User getUser(String userName);
	public List<User> getAllUser();
	public User updateUser(User user);
	public void deleteUser(long id);

}
