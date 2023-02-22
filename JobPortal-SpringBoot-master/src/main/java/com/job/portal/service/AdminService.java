package com.job.portal.service;

import java.util.List;

import com.job.portal.model.Job;
import com.job.portal.model.JobCategiry;
import com.job.portal.model.User;

public interface AdminService {
	
	public List<User> listOfCompany();
	public List<User> listOfCandidate();
	public List<User> getAllUser();
	public JobCategiry addJobCategiry(JobCategiry jobCategiry);
	public void deleteJobCategiry(long id);
	public List<Job> getAllJob();
	public List<JobCategiry> getAllCategiry();

}
