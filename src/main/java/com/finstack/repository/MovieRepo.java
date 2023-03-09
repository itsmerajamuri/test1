package com.finstack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.finstack.model.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer>{
	
	@Query(value="select * from movie_details where genere=:gen",nativeQuery = true)
	public List<Movie> getMoviesByGenere(@Param("gen") String genere);
	
	public List<Movie> findByUpvotesGreaterThan(int upvotes);
	

	
}
