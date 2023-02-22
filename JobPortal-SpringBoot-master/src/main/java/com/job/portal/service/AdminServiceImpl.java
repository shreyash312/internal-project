package com.job.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.portal.model.Job;
import com.job.portal.model.JobCategiry;
import com.job.portal.model.User;
import com.job.portal.repository.JobCategiryRepository;
import com.job.portal.repository.JobRepository;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private UserService userService;
	@Autowired
	private JobCategiryRepository jobCategiryRepository;
	@Autowired
	private JobRepository jobRepository;
	
	List<User> companyList;
	List<User> candidateList;

	@Override
	public List<User> listOfCompany() {
		List<User> allUser = getAllUser();
		
		allUser.forEach(user ->{
			if(user.getRole().equalsIgnoreCase("Company")) {
				companyList.add(user);
			}
		});
		return companyList;
	}

	@Override
	public List<User> listOfCandidate() {
		List<User> allUser = getAllUser();
		
		allUser.forEach(user ->{
			if(user.getRole().equalsIgnoreCase("candidate")) {
				candidateList.add(user);
			}
		});
		return candidateList;
	}

	@Override
	public List<User> getAllUser() {
		List<User> allUser = userService.getAllUser();
		return allUser;
	}

	@Override
	public JobCategiry addJobCategiry(JobCategiry jobCategiry) {
		JobCategiry save = jobCategiryRepository.save(jobCategiry);
		return save;
	}

	@Override
	public void deleteJobCategiry(long id) {
		jobCategiryRepository.deleteById(id);

	}

	@Override
	public List<Job> getAllJob() {
		List<Job> list = jobRepository.findAll();
		return list;
	}

	@Override
	public List<JobCategiry> getAllCategiry() {
		List<JobCategiry> list = jobCategiryRepository.findAll();
		return list;
	}
	
	

}
