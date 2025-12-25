package com.smartclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartclinic.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	/*
	 * ToDo:save()
	 * 
	 * findAll()
	 * 
	 * findById()
	 * 
	 * delete()
	 * 
	 * using Hibernate we are doing some operations like create get,etc.
	 */

}
