package com.cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.dto.MoviesDTO;
import com.cinema.dtotoentity.MovieDtoToEntity;
import com.cinema.entity.Movies;
import com.cinema.service.MovieService;


@RestController
public class MovieController {
	@Autowired
	MovieDtoToEntity movieDtoToEntity;
	
	@Autowired
	MovieService movieservice;
	@PostMapping(value = "/addmovie", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_XML_VALUE })
	
	public Movies addMovie(@RequestBody MoviesDTO movies) {
		
		return movieservice.addMovie(movieDtoToEntity.convertMovieDtoToEntity(movies));
	}
}
