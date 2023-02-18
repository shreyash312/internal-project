package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.axis.exception.IdNotFoundException;
import com.axis.model.User;
import com.axis.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		Optional<User> user=userRepository.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		else
			throw new IdNotFoundException("user not found with this id");
		
	}

	@Override
	public User updateUserById(int id, User user) {
		Optional<User> updateUser=userRepository.findById(id);
		if(updateUser.isPresent()) {
			return userRepository.save(user);
		}
		else
			throw new IdNotFoundException("user not found with this id");
		
	}

	@Override
	public String deleteUserById(int id) {
		// TODO Auto-generated method stub
		Optional<User> deleteUser=userRepository.findById(id);
		if(deleteUser.isPresent()) {
			userRepository.deleteById(id);
			return "user deleted";
		}
		else
			throw new IdNotFoundException("user not found to delete");
	}

}
