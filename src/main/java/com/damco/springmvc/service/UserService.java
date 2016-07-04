package com.damco.springmvc.service;

import java.util.List;

import com.damco.springmvc.model.User;


public interface UserService {
	
	User findById(int id);
	
	User findBySSO(String sso);
	
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUserBySSO(String sso);

	List<User> findAllUsers(); 
	public List<User> findAllUser();
	
	boolean isUserSSOUnique(Integer id, String sso);
	
	public List<User> findAllDbaUsers();

}