package com.stackroute.configurationserver;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationServerApplicationTests {
	
	@Autowired
	ConfigurableEnvironment environment;

	@Test
	public void contextLoads() {
		assertFalse(this.environment.getPropertySources().contains("application"));
	}
	
}
