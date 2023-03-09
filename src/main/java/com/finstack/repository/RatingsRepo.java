package com.finstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finstack.model.Ratings;

public interface RatingsRepo extends JpaRepository<Ratings, Integer>{
	
}
