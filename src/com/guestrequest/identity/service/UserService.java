package com.guestrequest.identity.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guestrequest.identity.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public UserService() {
		System.out.println("UserService instanciada !!!! ");
		System.out.println("...... repository : " + repository);
	}

	@PostConstruct
	public void init() {
		System.out.println("........2X repository : " + repository);
	}
	
}
