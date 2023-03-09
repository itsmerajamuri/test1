package com.finstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finstack.dto.MovieRatingDto;
import com.finstack.service.RatingsService;

@RequestMapping("/ratings")
@RestController
public class ReviewAndRatingsController {
	
	@Autowired
	RatingsService ratingsService;
	
	@GetMapping("/{id}")
	public MovieRatingDto getSingleMovieByRatingandReview(@PathVariable(value="id") int id) {
		return ratingsService.getSingleMovieByRatingandReview(id);
	}
	
	@PostMapping("/review")
	public MovieRatingDto writeReviewOnaMoview(@RequestBody  MovieRatingDto dto) {
		return ratingsService.writeReviewOnaMoview(dto);
	}

}
