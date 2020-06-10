package com.userregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.userregistration.dao.AdminDao;
import com.userregistration.model.User;
@Service("AdminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	@Override
	public List<User> listAllUsers() {
		return null;
	}

	@Override
	public Boolean deleteUserById(int userId) {
		return false;
	}

}
