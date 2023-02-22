package com.job.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.job.portal.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findByuserName(String userName);
}
