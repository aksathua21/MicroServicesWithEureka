package com.ratingdataservice.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ratingdataservice.domain.Movie;
import com.ratingdataservice.domain.MovieRating;

@RequestMapping(value="/api/rating")
@RestController
public class RatingController{

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public MovieRating getRatingById(@PathVariable("id") int id) {
		Map<Integer,MovieRating> ratingMap = new HashMap<>();
		MovieRating moverating = new MovieRating();
		moverating.setUerId(111);
		moverating.setUserName("Arun Sathua");
		Movie movie = new Movie();
		movie.setMovieId(123);
		movie.setRating(4);
		Movie movie1 = new Movie();
		movie1.setMovieId(124);
		movie1.setRating(5);
		List<Movie> movieList = new ArrayList<>();
		movieList.add(movie);
		movieList.add(movie1);
		moverating.setMovie(movieList);
		ratingMap.put(moverating.getUerId(), moverating);
		return ratingMap.get(id);	
	}
}
