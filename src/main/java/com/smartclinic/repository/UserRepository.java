package com.smartclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartclinic.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	/*
	 * This gives you:
	 * 
	 * save()
	 * 
	 * findAll()
	 * 
	 * findById()
	 * 
	 * delete()
	 */
	
}
