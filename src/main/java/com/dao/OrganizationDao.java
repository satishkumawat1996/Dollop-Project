package com.dao;

import java.util.List;

import com.model.Organization;

public interface OrganizationDao {
	public void addOrganization(Organization organization);
	public void updateOrganization(Organization organization);
	public void removeOrganization(Integer id);
	public Organization getOrganizationById(Integer id);
	public List<Organization> getAllOrganization();
}
