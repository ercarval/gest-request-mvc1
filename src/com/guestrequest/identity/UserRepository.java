package com.guestrequest.identity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserRepository {

	private EntityManagerFactory emf;
	
	public UserRepository() {
		
		emf = Persistence.createEntityManagerFactory("guestRequestPU");
		
	}
	
	
}
