package com.userregistration.service;

import java.util.List;

import com.userregistration.model.User;

public interface AdminService {
	List<User> listAllUsers();
	Boolean deleteUserById(int userId);
}
