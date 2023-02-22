package com.job.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.portal.model.ApplyJob;
@Repository
public interface ApplyJobRepository extends JpaRepository<ApplyJob, Long> {

}
