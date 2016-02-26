package com.guestrequest.identity;

import com.guestrequest.identity.exception.UserNotFoundException;

public class AuthProvider {
	
	
	public User authenticate( Login login ) throws UserNotFoundException {
		
		if ( !(login.getUsername().equals("admin")
				&& login.getPassword().equals("admin"))) {
			throw new UserNotFoundException("Tira os Zoio vc nao tem os poderes necessários para acessar o mega sistema");
		}
		
		User user = new User("Mega Admin" 
							, "megaadmin@guestrequest.com"
							, login);
		
		return user;
	}
	


}
