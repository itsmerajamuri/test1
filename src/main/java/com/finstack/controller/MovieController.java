package com.finstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finstack.dto.MovieDto;
import com.finstack.service.MovieServiceImpl;
@RequestMapping("/movie")
@RestController
public class MovieController {
	
	@Autowired
	MovieServiceImpl impl;
	@GetMapping("/{genere}")
	public List<MovieDto> getAllMoviesByGenere(@PathVariable("genere") String genere){
		List<MovieDto> dtolist= impl.getAllmoviesByGenere(genere);
		return dtolist;
	}
	@GetMapping("/topRated/{upvote}")
	public List<MovieDto> getAllTopRatedMovies(@PathVariable(value="upvote") int upvote){
		return impl.getAllTopRatedMovies(upvote);
	}

}
