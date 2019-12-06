package com.moviecatalogservice.domain;

public class MovieInfo {

	private int movieId;
	private String movieName;
	private String releaseddate;
	private String productionHouse;
	 
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getReleaseddate() {
		return releaseddate;
	}
	public void setReleaseddate(String releaseddate) {
		this.releaseddate = releaseddate;
	}
	public String getProductionHouse() {
		return productionHouse;
	}
	public void setProductionHouse(String productionHouse) {
		this.productionHouse = productionHouse;
	}
}
