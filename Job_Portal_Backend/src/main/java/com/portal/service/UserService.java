package com.portal.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.portal.entity.Candidates;
import com.portal.entity.UserDtls;

public interface UserService {

	public UserDtls createUser(UserDtls user);

	public boolean checkEmail(String email);

	UserDtls signInWithUserReturnJwt(UserDtls userDto);

	UserDtls checkEmailAndMob(String email, String mob);

	UserDtls resetPassword(UserDtls user);

	public Candidates applyJob(Candidates candidates, HttpServletRequest request);

	public List<Candidates> getAppliedJob(HttpServletRequest request);
}
