package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Job;
import com.axis.exception.IdNotFoundException;
import com.axis.repository.JobRepository;

@Service 
public class JobServiceImpl implements JobService {

	@Autowired
	JobRepository jobRepository;
	
	@Override
	public Job addJob(Job job) {
		// TODO Auto-generated method stub
		return jobRepository.save(job);
	}

	@Override
	public List<Job> getAllJob() {
		// TODO Auto-generated method stub
		return jobRepository.findAll();
		
	}

	@Override
	public Job getJobById(int id) {
		// TODO Auto-generated method stub
		Optional<Job> job=jobRepository.findById(id);
		if(job.isPresent())
			return job.get();
		else
			throw  new IdNotFoundException("No id is present to get value");
		
		
	}

	@Override
	public Job updateJobById(int id, Job job) {
		// TODO Auto-generated method stub
		Optional<Job> emp=jobRepository.findById(id);
		if(emp.isPresent())
			return jobRepository.save(job);
		else
			throw  new IdNotFoundException("No id is present to update");
	}

	@Override
	public String deleteJobById(int id) {
		Optional<Job> emp=jobRepository.findById(id);
		if(emp.isPresent()) {
			jobRepository.deleteById(id);
			return "Job deleted";
		}
		else
			throw  new IdNotFoundException("No id is present to delete");
		
	}

	
}
