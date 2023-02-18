package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.axis.exception.IdNotFoundException;

import com.axis.model.User;
import com.axis.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;
	
	
	
	@PostMapping("/addUser")
	ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/showUser")
	ResponseEntity<List<User>> getAllUser(){
		return new ResponseEntity<List<User>>(userService.getAllUser(),HttpStatus.OK);
	}
	
	@GetMapping("/showUser/{id}")
	ResponseEntity<User> getUserById(@PathVariable int id){
		return new ResponseEntity<User>(userService.getUserById(id),HttpStatus.OK);
	}
	
	@PutMapping("/updateUser/{id}")
	ResponseEntity<User> updateUserById(@PathVariable int id,@RequestBody User user){
		return new ResponseEntity<User>(userService.updateUserById(id, user),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	ResponseEntity<String> deleteUserById(@PathVariable int id){
		return new ResponseEntity<String>(userService.deleteUserById(id),HttpStatus.OK);
	}
	@ExceptionHandler(IdNotFoundException.class)
	ResponseEntity<String> myException(IdNotFoundException exception){
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.NOT_FOUND);
	}
	
}
