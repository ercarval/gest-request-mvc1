package com.guestrequest.identity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guestrequest.identity.Login;
import com.guestrequest.identity.User;
import com.guestrequest.identity.service.UserService;

@RestController
public class LoginController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/api/auth/login" 
					,method=RequestMethod.POST)	
	public User login ( @RequestBody Login login) {
		return new User("Bisso", "ercarval@gmail.com" 
					, new Login("admin", "admin"));
	}


	@RequestMapping(value="/api/auth" 
					,method=RequestMethod.GET)	
	public String login() {
		return "Caraca Maluco";
	}
	
	
}
