package com.guestrequest.identity;

import com.guestrequest.identity.exception.UserNotFoundException;

public class AuthProvider {
	
	
	public User authenticate( Login login ) throws UserNotFoundException {
		
		if ( !(login.getUsername().equals("admin")
				&& login.getPassword().equals("admin"))) {
			throw new UserNotFoundException("");
		}
		
		
		return user;
	}
	


}
