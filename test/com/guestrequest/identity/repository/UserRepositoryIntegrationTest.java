package com.guestrequest.identity.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.guestrequest.identity.Login;
import com.guestrequest.identity.User;

public class UserRepositoryIntegrationTest {
	
	
	public static void createUserTest () {
		
		ApplicationContext context 
				
				= new FileSystemXmlApplicationContext
						("WebContent/WEB-INF/application-context.xml");
				
		
		UserRepository repository = context.getBean("userRepository" 
												, UserRepository.class);
		
		User user = new User ();
		user.setLogin(new Login("admin", "admin"));
		user.setEmail("mega.admin@admin.com");
		user.setName("mega.admin");
		
		user = repository.create(user);
		
		System.out.println(user);
		
		User storedUser = repository.findById(user.getId());
		
		System.out.println(storedUser);
		
	}
	

	public static void main(String[] args) {
		
		createUserTest();
		
	}	

}
