package com.finstack.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finstack.dto.MovieDto;
import com.finstack.model.Movie;
import com.finstack.repository.MovieRepo;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	MovieRepo movieRepo;
	@Autowired
	ModelMapper mapper;
	@Override
	public List<MovieDto> getAllmoviesByGenere(String genere) {
		 List<Movie> movie= movieRepo.getMoviesByGenere(genere);
		return  movie.stream().map((movie1)->mapper.map(movie1, MovieDto.class)).collect(Collectors.toList());		
		
	}
	public List<MovieDto> getAllTopRatedMovies(int upvote){
		List<Movie> movie= movieRepo.findByUpvotesGreaterThan(upvote);
		return movie.stream().map((movie1)->mapper.map(movie1, MovieDto.class)).collect(Collectors.toList());
	}
	@Override
	public MovieDto upVoteOrdownVote(MovieDto movie) {
		Movie movi= mapper.map(movie, Movie.class);
		 
		 return mapper.map(movieRepo.save(movi),MovieDto.class );
		
		
	}
	

}
