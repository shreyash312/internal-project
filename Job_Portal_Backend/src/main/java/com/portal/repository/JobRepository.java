package com.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.entity.Jobs;
import com.portal.entity.UserDtls;

public interface JobRepository extends JpaRepository<Jobs, Integer> {

	public List<Jobs> findByRecruiter(UserDtls user);

}
