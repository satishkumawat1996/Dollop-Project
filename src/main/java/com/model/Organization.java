package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="organization")
public class Organization {
	
	@Id	@Column(name="organization_id")
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer organizationId;
	@Column(name="organization_name")
	private String organizationName;
	
	@OneToOne(mappedBy="organization")
	public Integer getOrgainzationId() {
		return organizationId;
	}
	public void setOrgainzationId(Integer orgainzationId) {
		this.organizationId = orgainzationId;
	}
	
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	
	
	
	
}
