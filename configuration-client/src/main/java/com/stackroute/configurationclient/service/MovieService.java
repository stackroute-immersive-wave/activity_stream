package com.stackroute.configurationclient.service;

import java.util.List;

import com.stackroute.configurationclient.domain.Movie;

public interface MovieService {
	
	public List<Movie> listAllMovies();
	public Movie getMovieById(String imdbID);
	public Movie saveMovie(Movie movie);
	public void deleteMovie(String imdbID);
	public void updateMovie(String imdbID, Movie movie);
}
