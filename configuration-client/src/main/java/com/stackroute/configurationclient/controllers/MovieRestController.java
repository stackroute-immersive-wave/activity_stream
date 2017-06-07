package com.stackroute.configurationclient.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.configurationclient.domain.Movie;
import com.stackroute.configurationclient.service.MovieService;

@RefreshScope
@RestController
@CrossOrigin
@RequestMapping("/v1/api/movie/client")
public class MovieRestController {
	
	private MovieService movieService;
	
	@Autowired
	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}
	    
	@RequestMapping(value="",method=RequestMethod.GET)
    public @ResponseBody  Iterable<Movie>  list() {
    	
    	List<Movie> allMovies = movieService.listAllMovies();
     	return allMovies;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
    public Movie getMovie(@PathVariable String id){
        
        return movieService.getMovieById(id);
    }
	
    @RequestMapping(value="", method=RequestMethod.POST)
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
    	Movie savedMovie = movieService.saveMovie(movie);
	   return new ResponseEntity<Movie>(savedMovie, HttpStatus.OK);
    }
    
    @RequestMapping(value="{id}", method=RequestMethod.PUT)
    public ResponseEntity<Map<String,String>> updateMovie(@PathVariable String id, @RequestBody Movie movie){
    	movieService.updateMovie(id, movie);
    	Map<String,String> msgMap = new HashMap<String,String>();
        msgMap.put("message","Movie updated successsfully");
        return new ResponseEntity<Map<String,String>>(msgMap, HttpStatus.OK);
    }
    
    @RequestMapping(value="{id}",method=RequestMethod.DELETE)
    public ResponseEntity<Map<String,String>> deleteMovie(@PathVariable String id){
    	movieService.deleteMovie(id);
    	Map<String,String> msgMap = new HashMap<String,String>();
        msgMap.put("message","Movie deleted successsfully");
        return new ResponseEntity<Map<String,String>>(msgMap, HttpStatus.OK);
    }
}
