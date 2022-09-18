package com.samples.SpringMVCorm.service;

import java.util.List;

import com.samples.SpringMVCorm.entity.User;


public interface UserService {

	int save(User user);
	
	List<User> getUsers();
	
}