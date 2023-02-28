package com.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.entity.Candidates;
import com.portal.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/applyJob")
	public ResponseEntity<?> applyJob(@RequestBody Candidates candidates, HttpServletRequest request) {
		return new ResponseEntity<>(userService.applyJob(candidates, request), HttpStatus.CREATED);
	}

	@GetMapping("/getAppliedJob")
	public ResponseEntity<?> getAppliedJob(HttpServletRequest request) {
		return new ResponseEntity<>(userService.getAppliedJob(request), HttpStatus.OK);
	}

}
