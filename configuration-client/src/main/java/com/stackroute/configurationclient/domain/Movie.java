package com.stackroute.configurationclient.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties(ignoreUnknown = true)
@Document
public class Movie {
    
    @Id
	private String imdbID;
    
    
    private String title;
    
    
    private String year;
    
    
    private String poster;


    public String getImdbID() {
    	return imdbID;
    }
    
    public void setImdbID(String imdbID) {
    	this.imdbID = imdbID;
    }

    @JsonProperty("Title")
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    @JsonProperty("Year")
    public String getYear() {
    	return year;
    }
    
    public void setYear(String year) {
    	this.year = year;
    }

    @JsonProperty("Poster")
    public String getPoster() {
    	return poster;
    }
    
    public void setPoster(String poster) {
    	this.poster = poster;
    }
}
