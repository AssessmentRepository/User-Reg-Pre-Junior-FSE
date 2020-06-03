package com.userregistration.dao;

public interface LoginDao {
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
