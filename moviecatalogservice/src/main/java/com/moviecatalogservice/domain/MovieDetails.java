package com.moviecatalogservice.domain;

public class MovieDetails {
	
	private int movieid;
	private String moviename;
	private String releasedate;
	private String productionhouse;
	private int userrating;
	
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getReleasedate() {
		return releasedate;
	}
	public void setReleasedate(String releasedate) {
		this.releasedate = releasedate;
	}
	public String getProductionhouse() {
		return productionhouse;
	}
	public void setProductionhouse(String productionhouse) {
		this.productionhouse = productionhouse;
	}
	public int getUserrating() {
		return userrating;
	}
	public void setUserrating(int userrating) {
		this.userrating = userrating;
	}
	
}
