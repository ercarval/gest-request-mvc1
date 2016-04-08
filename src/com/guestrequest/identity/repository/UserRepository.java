package com.guestrequest.identity.repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guestrequest.identity.User;
import com.guestrequest.shared.datasource.MegaDataSource;

@Repository
public class UserRepository {
	
	@PersistenceContext
	private EntityManager em;

	public UserRepository() {
	}
	
	@PostConstruct
	public void init() {
	}
	
	public User create (User user) {
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		
		return user;
	}
	
	public User update (User user) {
		
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		
		return user;
	}
	
	
	public User findById ( Long id ) {	
		return em.find( User.class , id);		
	}
	
	
}
