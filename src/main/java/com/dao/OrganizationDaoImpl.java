package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.model.Organization;


public class OrganizationDaoImpl implements OrganizationDao{

	private static final Logger logger=LoggerFactory.getLogger(OrganizationDaoImpl.class);
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addOrganization(Organization organization) {
		Session session=this.sessionFactory.getCurrentSession();
		session.persist(organization);
		logger.info("organization added successfully");
	}
	
	@Override
	public void updateOrganization(Organization organization) {
		Session session=this.sessionFactory.getCurrentSession();
		session.update(organization);
		logger.info("organization updated successfully");
	}
	
	@Override
	public void removeOrganization(Integer id) {
		Session session=this.sessionFactory.getCurrentSession();
		session.delete(id);
		logger.info("organization deleted successfully");
	}
	
	@Override
	public Organization getOrganizationById(Integer id) {
		Session session=this.sessionFactory.getCurrentSession();
		Organization organization=(Organization)session.load(Organization.class,id);
		return organization;
		
	}
	
	@Override
	public List<Organization> getAllOrganization() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Organization> organizationList = session.createQuery("from Organization").list();
		for(Organization organization : organizationList){
			logger.info("Person List::"+organization);
		}
		return organizationList;
	}
}
