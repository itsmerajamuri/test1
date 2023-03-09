package com.finstack.dto;

public class MovieRatingDto {
	
	int id;
	
	String moviename;
	
	int rating;

	String moviereview;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getMoviereview() {
		return moviereview;
	}

	public void setMoviereview(String moviereview) {
		this.moviereview = moviereview;
	}

	@Override
	public String toString() {
		return "MovieRatingDto [id=" + id + ", moviename=" + moviename + ", rating=" + rating + ", moviereview="
				+ moviereview + "]";
	}

	public MovieRatingDto() {
		super();
	}

	
	

}
