package com.userregistration.dao;

import com.userregistration.model.User;

public interface UserDao {	
	boolean saveUser(User user);
	User getUserById(int userId);
	void updateUserById(int userId,User user);	
}
