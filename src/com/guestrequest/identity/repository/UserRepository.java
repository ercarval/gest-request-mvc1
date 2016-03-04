package com.guestrequest.identity.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guestrequest.shared.datasource.MegaDataSource;

@Repository
public class UserRepository {

	@Autowired
	private MegaDataSource datasource;

	public UserRepository() {
		System.out.println("UserRepository instanciado ");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("....... datasource : " + datasource);
	}
	
	
}
