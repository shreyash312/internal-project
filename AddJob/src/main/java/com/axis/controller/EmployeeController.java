//package com.axis.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.axis.entity.Job;
//import com.axis.exception.IdNotFoundException;
//import com.axis.service.JobService;
//
//@RestController
//@RequestMapping("api/v1")
//public class EmployeeController {
//
//	@Autowired
//	JobService jobService;
//	
//	@PostMapping("/employee")
//	public Job addEmployee(@RequestBody Job job)
//	{
//		return jobService.addEmployee(job);
//	}
//	
//	@GetMapping("/employee")
//	public List<Job> getAllEmployee()
//	{
//		return jobService.getAllEmployees();
//	}
//	
//	@GetMapping("/employee/{id}")
//	public Job getEmployeeById(@PathVariable int id)
//	{
//		return jobService.getEmployeeById(id);
//	}
//	
//	@PutMapping("/employee/{id}")
//	public Job updaEmployeeById(@PathVariable int id,@RequestBody Job job) {
//		return jobService.updateEmployeeById(id, job);
//	}
//	
//	@DeleteMapping("/employee/{id}")
//	public String deleEmployeeById(@PathVariable int id) {
//		return jobService.deleteEmployeeById(id);
//	}
//	
////	@ExceptionHandler(IdNotFoundException.class)
////	public String myException(IdNotFoundException exception) {
////		return exception.getMsg();
////	}
//}
