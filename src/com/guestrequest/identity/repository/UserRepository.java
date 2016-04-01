package com.guestrequest.identity.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guestrequest.identity.User;
import com.guestrequest.shared.datasource.MegaDataSource;

@Repository
public class UserRepository {
	
	private EntityManagerFactory emf;

	public UserRepository() {
		emf = Persistence.createEntityManagerFactory("guestRequestPU");
	}
	
	@PostConstruct
	public void init() {
	}
	
	public User create (User user) {
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		
		return user;
	}
	
	
	public User findById ( Long id ) {	
		EntityManager em = emf.createEntityManager();	
		return em.find( User.class , id);		
	}
	
	
}
