package com.job.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.portal.model.ApplyJob;
import com.job.portal.model.Job;
import com.job.portal.model.JobCategiry;
import com.job.portal.model.User;
import com.job.portal.repository.ApplyJobRepository;
import com.job.portal.repository.JobCategiryRepository;
import com.job.portal.repository.JobRepository;
import com.job.portal.repository.UserRepository;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private JobRepository jobRepository;
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ApplyJobRepository applyRepository;
	
	@Autowired
	private JobCategiryRepository jobCategiryRepository;
	
	private List<Job> showJob;
	private List<User> candidateList;

	@Override
	public Job addJob(Job job) {
		Job save = jobRepository.save(job);

		return save;
	}

	@Override
	public void deleteJob(long id) {
		jobRepository.deleteById(id);

	}

	@Override
	public List<Job> showJobPosted(long companyId) {
		List<Job> list=jobRepository.findAll();
		list.forEach(e->{
			if(companyId==e.getUserId()) {
				showJob.add(e);
			}
		});
		return showJob;
	}

	@Override
	public List<User> applyCandidate(long jobId) {
		List<ApplyJob> list = applyRepository.findAll();
		List<User> ulist= userRepository.findAll();
		list.forEach(e->{
			if(e.getJobId()==jobId) {
				ulist.forEach(u->{
					if(e.getCandidate()==u.getId()) {
						candidateList.add(u);
					}
				});
				
			}
			
		});
		return candidateList;
	}

	@Override
	public JobCategiry addCategory(JobCategiry categiry) {
		JobCategiry save = jobCategiryRepository.save(categiry);

		return save;
	}

	

}
