package com.userregistration.service;

import com.userregistration.model.User;

public interface UserService {
	Boolean saveUser(User user);
	User getUserById(int userId);
	Boolean updateUserById(int userId, User user);
}
