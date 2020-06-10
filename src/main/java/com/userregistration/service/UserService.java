package com.userregistration.service;

import com.userregistration.model.User;

public interface UserService {
	boolean saveUser(User user);
	User getUserById(int userId);
	boolean updateUserById(int userId, User user);
}
