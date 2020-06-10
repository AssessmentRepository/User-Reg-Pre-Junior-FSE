package com.userregistration.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.userregistration.model.User;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub

	}

}
