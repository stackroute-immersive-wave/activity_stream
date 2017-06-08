package com.stackroute.movieapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigurationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationClientApplication.class, args);
	}
}
