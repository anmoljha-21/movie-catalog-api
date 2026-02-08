package com.anmoljha.movie_catalog_api.exception;

public class MovieNotFoundException extends RuntimeException {
	public MovieNotFoundException(String message) {
		super(message);
	}
}
