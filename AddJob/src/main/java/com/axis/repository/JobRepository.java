package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.axis.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {

}
