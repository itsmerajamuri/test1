package com.finstack.service;

import com.finstack.dto.UserDto;

public interface UserService {
	
	public UserDto createCustomer(UserDto user);
	public UserDto setFavgenere(UserDto user);

}
