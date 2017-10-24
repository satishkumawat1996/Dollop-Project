package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(Integer id);
	public User getById(Integer id);
	public List<User> getAllUser();
}
