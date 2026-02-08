package com.anmoljha.movie_catalog_api.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

	private Integer id;
	@NotBlank
	private String name;
	@NotBlank
	@Size(min =5, max = 500)
	private String description;
	@NotBlank
	private String genre;
	@Max(10)
	@Min(0)
	private Double rating;
}
