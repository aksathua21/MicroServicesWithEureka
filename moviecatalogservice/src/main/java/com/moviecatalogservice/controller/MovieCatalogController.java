package com.moviecatalogservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moviecatalogservice.domain.MovieCatalog;
import com.moviecatalogservice.serviceImpl.MovieCatalogServiceImpl;

@RequestMapping(value="/api/moviecatalog")
@RestController
public class MovieCatalogController {
	
	@Autowired
	MovieCatalogServiceImpl movieCatalogServiceImpl;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public MovieCatalog getMovieCatalogByUserId(@PathVariable("id") int id) {
		return movieCatalogServiceImpl.getMovieCatalogByUserId(id);
	}
}
