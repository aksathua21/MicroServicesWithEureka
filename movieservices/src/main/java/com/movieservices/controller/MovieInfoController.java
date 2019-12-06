package com.movieservices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movieservices.domain.MovieInfo;
import com.movieservices.repository.MovieInfoRepository;

@RequestMapping(value="api/movie")
@RestController
public class MovieInfoController {
	
	@Autowired
	private MovieInfoRepository movieInfoRepository;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(@RequestBody MovieInfo movie) {
		 movieInfoRepository.save(movie);
		 return "success";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<MovieInfo> getMoveInfoById(@PathVariable("id") int id) {
		System.out.println("inside getMoveInfoById");
		return movieInfoRepository.findById(id);
	}

}
