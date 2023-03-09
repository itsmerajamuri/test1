package com.finstack.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finstack.dto.UserDto;
import com.finstack.model.User;
import com.finstack.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
    UserRepo repo;
	@Autowired
	ModelMapper mapper;
	@Override
	public UserDto createCustomer(UserDto user) {
		User us= mapper.map(user, User.class);
		 
		 return mapper.map(repo.save(us),UserDto.class );
		
	}
	@Override
	public UserDto setFavgenere(UserDto user) {
		User us= mapper.map(user, User.class);
		 
		 return mapper.map(repo.save(us),UserDto.class );
		
		
	}

}
