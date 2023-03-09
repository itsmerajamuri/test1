package com.finstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finstack.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
