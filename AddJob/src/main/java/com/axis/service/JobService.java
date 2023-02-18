package com.axis.service;


import java.util.List;

import com.axis.entity.Job;

public interface JobService {

	Job addJob(Job job);
	List <Job> getAllJob();
	
	Job getJobById(int id);
	
	Job updateJobById(int id, Job job);
	
	String deleteJobById(int id);
	
}
