package com.job.portal.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.portal.model.User;
import com.job.portal.service.UserService;

@RestController
@RequestMapping("/register")

public class RegisterController {
	@Autowired
	private UserService userService;
	@PostMapping("/")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createUser = userService.createUser(user);
		return new ResponseEntity<User>(createUser,HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> list = userService.getAllUser();
		return new ResponseEntity<List<User>>(list,HttpStatus.OK);
	}
	@PutMapping("/")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		User createUser = userService.updateUser(user);
		return new ResponseEntity<User>(createUser,HttpStatus.OK);
	}
	
	

}
