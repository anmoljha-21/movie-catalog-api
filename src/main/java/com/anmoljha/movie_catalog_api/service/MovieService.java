package com.anmoljha.movie_catalog_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anmoljha.movie_catalog_api.exception.MovieNotFoundException;
import com.anmoljha.movie_catalog_api.model.Movie;

@Service
public class MovieService {
	Movie movie;
	
	List<Movie> movies = new ArrayList<>();
	private int counter;
	
	public Movie addMovie(Movie movie) {
		movie.setId(counter++);
		movies.add(movie);
		return movie;
	}
	
	public Movie getMovieById(Integer id) {
		for(Movie movie:movies) {
			if(movie.getId().equals(id))
			return movie;
		}
		throw new MovieNotFoundException("Movie not found with id: " + id);
		
	}
}
	
