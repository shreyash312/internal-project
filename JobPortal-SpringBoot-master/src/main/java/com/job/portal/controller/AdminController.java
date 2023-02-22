package com.job.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.job.portal.model.Job;
import com.job.portal.model.JobCategiry;
import com.job.portal.model.User;
import com.job.portal.service.AdminService;
import com.job.portal.service.UserService;

@RestController
@RequestMapping("/admin")

public class AdminController {
	
	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/company")
	public ResponseEntity<List<User>> getAllCompany()
	{
		return new ResponseEntity<List<User>>(adminService.listOfCompany(),HttpStatus.OK);
	}
	@GetMapping("/candidate")
	public ResponseEntity<List<User>> getAllCandidate()
	{
		return new ResponseEntity<List<User>>(adminService.listOfCandidate(),HttpStatus.OK);
	}
	@GetMapping("/jobs")
	public ResponseEntity<List<Job>> getAllJob()
	{
		return new ResponseEntity<List<Job>>(adminService.getAllJob(),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<JobCategiry> addJobCtegiry(@RequestBody JobCategiry jobCategiry)
	{
		System.out.println(jobCategiry);
		JobCategiry categiry = adminService.addJobCategiry(jobCategiry);
		return new ResponseEntity<JobCategiry> (categiry,HttpStatus.OK);
	}
	@DeleteMapping("/categiry/{id}")
	public ResponseEntity<Void> deleteJobCategiry(@PathVariable long id)
	{
		adminService.deleteJobCategiry(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	@GetMapping("/jobcategiry")
	public ResponseEntity<List<JobCategiry>> getAllCatedity()
	{
		List<JobCategiry> list = adminService.getAllCategiry();
		return new ResponseEntity<List<JobCategiry>> (list,HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable long id)
	{
		userService.deleteUser(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	

}
