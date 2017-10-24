package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.model.Organization;
import com.service.OrganizationService;

@RestController
public class OrganizationController {
	
	@Autowired
	private OrganizationService organizationService;
	
	@RequestMapping(value="/organization", method=RequestMethod.GET)
	public ModelAndView getOrganizationPage(@ModelAttribute("command")  Organization category,
			   BindingResult result) {
		  Map<String, Object> model = new HashMap<String, Object>();
		  model.put("organizations",organizationService.getAllOrganization());
		  return new ModelAndView("organization", model);
		 }
	
	
	
	@RequestMapping(value="/organization/add" , method=RequestMethod.POST)
	public ModelAndView AddOrganization(@ModelAttribute("command") Organization organization,BindingResult result) {
		
	organizationService.addOrganization(organization);	
	return new ModelAndView("organization");
	}
	
	
}
