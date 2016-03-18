package com.guestrequest.requester.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guestrequest.identity.Login;
import com.guestrequest.identity.User;

@RestController
public class RequesterController {

	@RequestMapping(value = "/api/requester", method = RequestMethod.GET)
	public List<User> findByNameOrLogin(String name, String login) {

		User[] users = new User[] { new User("Bisso", "bisso@gmail.com", new Login("user", "")),
				new User("Ze das Cove", "ze@gmail.com", new Login("user", "")),
				new User("Dona Candinha", "dna.candinha@gmail.com", new Login("user", "")),
				new User("Bisso02", "bisso2@gmail.com", new Login("user", ""))

		};

		return Arrays.asList(users);

	}

}
