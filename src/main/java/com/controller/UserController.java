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

import com.model.User;
import com.service.OrganizationService;
import com.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private OrganizationService organizationService;
	

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getHome(@ModelAttribute("command")  User user,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("users",  userService.getAllUser());
		model.put("organizations", organizationService.getAllOrganization());
		return new ModelAndView("user", model);
		
	}
	
	@RequestMapping(value="/user/add", method=RequestMethod.POST)
	public ModelAndView addUserInfo(@ModelAttribute("user") User user)
	{
		userService.addUser(user);
		
		return new ModelAndView("user");
		
	}
	
}
