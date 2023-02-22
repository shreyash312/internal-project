package com.job.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.portal.model.User;
import com.job.portal.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		User save = userRepository.save(user);
		return save;
	}

	@Override
	public User getUser(String userName) {
		User user = userRepository.findByuserName(userName);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = userRepository.findAll();
		return list;
	}

	@Override
	public User updateUser(User user) {
		User save = userRepository.save(user);
		return save;
	}

	@Override
	public void deleteUser(long id) {
		userRepository.deleteById(id);
	}
}
