package com.finstack.service;


import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finstack.dto.MovieRatingDto;
import com.finstack.model.Ratings;
import com.finstack.repository.RatingsRepo;

@Service
public class RatingsService {
	@Autowired
	RatingsRepo ratingsRepo;
	
	@Autowired ModelMapper mapper;
	
	public MovieRatingDto getSingleMovieByRatingandReview(int id) {
		Optional<Ratings> rating= ratingsRepo.findById(id);
		Ratings r= rating.get();
		return mapper.map(r, MovieRatingDto.class);
	}
	
	public MovieRatingDto writeReviewOnaMoview(MovieRatingDto dto) {
		Ratings r= mapper.map(dto, Ratings.class);
		Ratings r1= ratingsRepo.save(r);
		return mapper.map(r1, MovieRatingDto.class);
	}
	

}
