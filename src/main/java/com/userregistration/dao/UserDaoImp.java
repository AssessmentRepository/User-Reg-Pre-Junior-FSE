package com.userregistration.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.userregistration.model.User;
@Repository
public class UserDaoImp implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUserById(int userId, User user) {
		// TODO Auto-generated method stub
		
	}

	
}
