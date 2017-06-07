package com.stackroute.configurationclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableDiscoveryClient
//@ComponentScan("com.stackroute.*")
public class ConfigurationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationClientApplication.class, args);
	}
}
