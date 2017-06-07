package com.stackroute.configurationclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.configurationclient.domain.Movie;
import com.stackroute.configurationclient.repositories.MovieRepositories;

@Service
public class MovieServiceImpl implements MovieService {
	
	
	private MovieRepositories movieRepository;
	
	@Autowired
	public void setMovieRepository(MovieRepositories movieRepository) {
		this.movieRepository = movieRepository;
	}

	public List<Movie> listAllMovies() {
				
		return (List<Movie>)movieRepository.findAll();
	}
	
	public Movie getMovieById(String ImdbID){
				
		return movieRepository.findOne(ImdbID);
	}

	public Movie saveMovie(Movie movie) {
		
		movieRepository.save(movie);
		return movie;
	}
	
	public void deleteMovie(String ImdbID) {
		
		movieRepository.delete(ImdbID);
		
	}
	
	public void updateMovie(String imdbID, Movie movie) {
		
		movieRepository.save(movie);
	}
}
