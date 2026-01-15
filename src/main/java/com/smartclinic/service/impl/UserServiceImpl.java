package com.smartclinic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smartclinic.model.User;
import com.smartclinic.repository.UserRepository;
import com.smartclinic.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
