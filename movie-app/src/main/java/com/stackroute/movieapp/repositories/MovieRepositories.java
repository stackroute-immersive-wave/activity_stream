package com.stackroute.movieapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.movieapp.domain.Movie;

@Repository
public interface MovieRepositories extends MongoRepository<Movie, String>{

}
