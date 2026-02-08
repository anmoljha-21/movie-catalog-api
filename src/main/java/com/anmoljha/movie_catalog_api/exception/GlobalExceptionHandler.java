package com.anmoljha.movie_catalog_api.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<String> movieNotFound(MovieNotFoundException ex){
		return ResponseEntity.status(404).body(ex.getMessage());
	}
}
