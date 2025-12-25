package com.smartclinic.service;

import java.util.List;

import com.smartclinic.model.User;

public interface UserService {

	User createUser(User user);

	List<User> getAllUsers();
}
