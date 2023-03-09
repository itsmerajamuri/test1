package com.finstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finstack.dto.UserDto;
import com.finstack.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl impl;
	
	@PostMapping("/")
	public UserDto createCustomer(@RequestBody UserDto user) {
	return	impl.createCustomer(user);
	}
	
	@PutMapping("/")
	public UserDto setFavGenere(@RequestBody UserDto user) {
	return	impl.setFavgenere(user);
	}

}
