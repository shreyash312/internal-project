package com.axis.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//this is another way to create controller
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.Job;
import com.axis.exception.IdNotFoundException;
import com.axis.service.JobService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/v2")
public class JobController {

	@Autowired
	JobService jobService;

	@PostMapping("/addjob")
	ResponseEntity<Job> addEmployee(@RequestBody Job job)
	{
		return new ResponseEntity<Job>(jobService.addJob(job),HttpStatus.OK);
	}
	
	@GetMapping("/showjobs")
	ResponseEntity<List<Job>> getAllEmployee()
	{
		return new ResponseEntity<List<Job>>(jobService.getAllJob(),HttpStatus.OK);
	}
	@GetMapping("/job/{id}")
	ResponseEntity<Job> getEmployeeById(@PathVariable int id){
		return new ResponseEntity<Job>(jobService.getJobById(id),HttpStatus.OK);
	}
	
	@PutMapping("/job/{id}")
	ResponseEntity<Job> updateEmployeeById(@PathVariable int id,@RequestBody Job job){
		return new ResponseEntity<Job>(jobService.updateJobById(id, job),HttpStatus.OK); 
	}
	@DeleteMapping("/job/{id}")
	ResponseEntity<String> deleteEmployeeById(@PathVariable int id){
		return new ResponseEntity<String>(jobService.deleteJobById(id),HttpStatus.OK);
	}
	
	@ExceptionHandler(IdNotFoundException.class)
	ResponseEntity<String> myException(IdNotFoundException exception){
		return new ResponseEntity<String>(exception.getMsg(),HttpStatus.NOT_FOUND);
	}
	
	
	
}
