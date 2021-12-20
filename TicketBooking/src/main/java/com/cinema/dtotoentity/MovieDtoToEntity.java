package com.cinema.dtotoentity;

import org.springframework.stereotype.Component;

import com.cinema.dto.MoviesDTO;
import com.cinema.entity.Movies;

@Component
public class MovieDtoToEntity {
	public Movies convertMovieDtoToEntity(MoviesDTO moviesDTO) {
		Movies movies = new Movies();
		movies.setMovieId(moviesDTO.getMovieId());
		movies.setMovieName(moviesDTO.getMovieName());
		return movies;
	}
}
