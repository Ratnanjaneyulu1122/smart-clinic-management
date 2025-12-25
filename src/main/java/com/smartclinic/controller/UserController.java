package com.smartclinic.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartclinic.model.User;
import com.smartclinic.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	// Create user
	@PostMapping
	public User createUser(@Valid @RequestBody User user) {
		return userService.createUser(user);
	}

	@GetMapping
	public List<User> getAllUsers() {
		//System.out.println(userService.getAllUsers().toString());
		return userService.getAllUsers();
	}

}
