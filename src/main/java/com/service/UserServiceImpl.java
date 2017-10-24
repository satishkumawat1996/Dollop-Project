package com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService 
{
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) 
	{
		this.userDao.addUser(user);	
	}

	@Override
	public void updateUser(User user) 
	{
		this.userDao.updateUser(user);
	}

	@Override
	public void deleteUser(Integer id)
	{
		this.userDao.deleteUser(id);
	}

	@Override
	
	public User getById(Integer id)
	{
		return this.userDao.getById(id);
	}

	@Override
	public List<User> getAllUser() 
	{
		return this.userDao.getAllUser();
	}

}
