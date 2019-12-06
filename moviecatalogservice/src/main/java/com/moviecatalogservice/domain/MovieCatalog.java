package com.moviecatalogservice.domain;

import java.util.List;

public class MovieCatalog {

	private int userId;
	private String userName;
	private List<MovieDetails> moviedetails;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<MovieDetails> getMoviedetails() {
		return moviedetails;
	}
	public void setMoviedetails(List<MovieDetails> moviedetails) {
		this.moviedetails = moviedetails;
	}
}
