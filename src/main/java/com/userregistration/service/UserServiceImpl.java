package com.userregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.userregistration.dao.UserDao;
import com.userregistration.model.User;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public Boolean saveUser(User user) {
		return false;
	}

	@Override
	public User getUserById(int userId) {
		return null;
	}

	@Override
	public Boolean updateUserById(int userId, User user) {
		return false;
	}
}
