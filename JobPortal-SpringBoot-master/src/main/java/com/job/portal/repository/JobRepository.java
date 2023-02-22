package com.job.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.job.portal.model.Job;


@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
	public Job getByjobTitle(String title);

}
