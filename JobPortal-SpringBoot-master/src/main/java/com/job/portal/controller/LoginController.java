package com.job.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.portal.model.User;
import com.job.portal.service.UserService;

@RestController
@RequestMapping("/login")

public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{userName}")
	public ResponseEntity<User> getUser(@PathVariable String userName){
		User user = userService.getUser(userName);
		if(user != null)
		{
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		return new ResponseEntity<User>(user,HttpStatus.BAD_REQUEST);
	}

}
