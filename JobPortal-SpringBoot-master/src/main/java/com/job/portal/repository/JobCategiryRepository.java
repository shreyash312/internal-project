package com.job.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.portal.model.JobCategiry;
@Repository
public interface JobCategiryRepository extends JpaRepository<JobCategiry, Long> {
	

}
