package com.guestrequest.identity.repository;

import org.springframework.stereotype.Repository;

import com.guestrequest.shared.datasource.MegaDataSource;

@Repository
public class UserRepository {

	private MegaDataSource datasource;

	public UserRepository() {
		System.out.println("UserRepository instanciado ");
	}
	
	
	
}
