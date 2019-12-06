package com.ratingdataservice.domain;

import java.util.List;

public class MovieRating {

	private int uerId;
	private String userName;
	private List<Movie> movie;
	public int getUerId() {
		return uerId;
	}
	public void setUerId(int uerId) {
		this.uerId = uerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Movie> getMovie() {
		return movie;
	}
	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}
	
}
