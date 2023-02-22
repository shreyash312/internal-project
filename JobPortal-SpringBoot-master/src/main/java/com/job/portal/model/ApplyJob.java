package com.job.portal.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class ApplyJob {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applyJobId;
	private int jobId;
	private int candidate;
	
	public long getApplyJobId() {
		return applyJobId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getCandidate() {
		return candidate;
	}
	public void setCandidate(int candidate) {
		this.candidate = candidate;
	}
	public void setApplyJobId(long applyJobId) {
		this.applyJobId = applyJobId;
	}
	
	
	

}
