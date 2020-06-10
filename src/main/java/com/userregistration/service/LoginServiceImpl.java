package com.userregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.userregistration.dao.LoginDao;
import com.userregistration.model.User;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	public boolean register(User user) {
		return false;
	}

	public boolean login(String userName, String password) {
		return false;
	}
	
	public boolean resetPassword(String userName, String password) {
		return false;
	}
}
