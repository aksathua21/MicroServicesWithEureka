package com.moviecatalogservice.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.moviecatalogservice.domain.Movie;
import com.moviecatalogservice.domain.MovieCatalog;
import com.moviecatalogservice.domain.MovieDetails;
import com.moviecatalogservice.domain.MovieInfo;
import com.moviecatalogservice.domain.MovieRating;

@Component
public class MovieCatalogServiceImpl {
	
	@Autowired
	private RestTemplate RestTemplate;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	public MovieCatalog getMovieCatalogByUserId(int id) {
		MovieCatalog movieCatalog = new MovieCatalog();
		MovieRating movieRating= RestTemplate.getForObject("http://MOVIE-RATING-SERVICE/api/rating/"+id, MovieRating.class);
		movieCatalog.setUserId(movieRating.getUerId());
		movieCatalog.setUserName(movieRating.getUserName());
		List<MovieDetails> list = new ArrayList<>();
		for(Movie movie:movieRating.getMovie()) {
			MovieInfo movieInfo = RestTemplate.getForObject("http://MOVIE-INFO-SERVICE/api/movie/"+movie.getMovieId(), MovieInfo.class);
			MovieDetails movieDetails = new MovieDetails();
			movieDetails.setMovieid(movieInfo.getMovieId());
			movieDetails.setMoviename(movieInfo.getMovieName());
			movieDetails.setReleasedate(movieInfo.getReleaseddate());
			movieDetails.setProductionhouse(movieInfo.getProductionHouse());
			movieDetails.setUserrating(movie.getRating());
			list.add(movieDetails);
			movieCatalog.setMoviedetails(list);
		}
		return movieCatalog;
	}
	
}
