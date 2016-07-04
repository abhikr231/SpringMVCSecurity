package com.damco.springmvc.dao;

import java.util.List;

import com.damco.springmvc.model.User;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();
	
	public List<User> findAllDbaUsers();
	public List<User> findAllUser();

}

