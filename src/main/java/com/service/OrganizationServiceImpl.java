package com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrganizationDao;
import com.model.Organization;


@Service
@Transactional
public class OrganizationServiceImpl implements OrganizationService {

	private OrganizationDao organizationDao;
	
	public void setOrganizationDao(OrganizationDao organizationDao) {
		this.organizationDao = organizationDao;
	}

	@Override
	public void addOrganization(Organization organization) {
		this.organizationDao.addOrganization(organization);
	}

	@Override
	public void updateOrganization(Organization organization) {
		this.organizationDao.updateOrganization(organization);
	}

	@Override
	public void removeOrganization(Integer id) {
		this.organizationDao.removeOrganization(id);
	}

	@Override
	public Organization getOrganizationById(Integer id) {
		return this.organizationDao.getOrganizationById(id);
	}

	@Override
	public List<Organization> getAllOrganization() {
		return this.organizationDao.getAllOrganization();
	}

}
