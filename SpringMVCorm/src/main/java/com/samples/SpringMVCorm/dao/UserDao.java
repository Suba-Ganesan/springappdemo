package com.samples.SpringMVCorm.dao;

import java.util.List;

import com.samples.SpringMVCorm.entity.User;


public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
	
}