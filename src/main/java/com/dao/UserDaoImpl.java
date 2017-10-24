package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	private static final Logger logger=LoggerFactory.getLogger(UserDao.class);
	
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

	@Override
	public void addUser(User user) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(user);
		logger.info("user added successfully");
	}

	@Override
	public void updateUser(User user) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(user);
		logger.info("user updated successfully");
	}

	@Override
	public void deleteUser(Integer id) {
		Session session=this.sessionFactory.getCurrentSession();
		session.delete(id);
		logger.info("user deleted successfully");
	}

	@Override
	public User getById(Integer id) {
		Session session=this.sessionFactory.getCurrentSession();
		User user=(User)session.load(User.class,id);
		
		return user;
	}

	@Override
	public List<User> getAllUser() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		for(User user : userList)
		{
			logger.info("Person List::"+user);
		}
		return userList;
	}

}
