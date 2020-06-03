package com.userregistration.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.userregistration.model.User;
@Repository
public class UserDaoImp implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int saveUser(User user) {
		return 0;		
	}

	@Override
	public User getUserById(int userId) {
		return null;
		
	}

	@Override
	public void updateUserById(int userId, User user) {
		
	}
}
