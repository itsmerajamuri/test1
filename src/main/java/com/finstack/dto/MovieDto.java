package com.finstack.dto;


public class MovieDto {
	
	int id;
	String movieName;
	String Genere;
	int upvotes;
	int downvotes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}
	public int getUpvotes() {
		return upvotes;
	}
	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}
	public int getDownvotes() {
		return downvotes;
	}
	public void setDownvotes(int downvotes) {
		this.downvotes = downvotes;
	}
	public MovieDto() {
		super();
	}
	@Override
	public String toString() {
		return "MovieDto [id=" + id + ", movieName=" + movieName + ", Genere=" + Genere + ", upvotes=" + upvotes
				+ ", downvotes=" + downvotes + "]";
	}
	
	
	

}
