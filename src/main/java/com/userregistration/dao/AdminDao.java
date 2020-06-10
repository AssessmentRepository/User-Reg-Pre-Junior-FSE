package com.userregistration.dao;

import java.util.List;

import com.userregistration.model.User;

public interface AdminDao {
	List<User> listAllUsers();
	void deleteUserById(int userId);
}
