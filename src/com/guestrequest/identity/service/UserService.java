package com.guestrequest.identity.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.guestrequest.identity.repository.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public UserService() {
		
		
	}


}
