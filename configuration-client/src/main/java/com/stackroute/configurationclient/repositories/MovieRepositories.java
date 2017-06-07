package com.stackroute.configurationclient.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.configurationclient.domain.Movie;

@Repository
public interface MovieRepositories extends MongoRepository<Movie, String>{

}
