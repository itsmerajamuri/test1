package com.finstack.service;

import java.util.List;

import com.finstack.dto.MovieDto;

public interface MovieService {

	public List<MovieDto> getAllmoviesByGenere(String genere);
	public List<MovieDto> getAllTopRatedMovies(int upvote);
	public MovieDto upVoteOrdownVote(MovieDto movie);
	
}
