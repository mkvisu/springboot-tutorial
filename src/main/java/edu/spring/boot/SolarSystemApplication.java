package edu.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import edu.spring.boot.config.SolarSystemConfig;
import edu.spring.boot.model.Planet;

@SpringBootApplication
public class SolarSystemApplication {

	@Autowired
	private SolarSystemConfig solarSystemConfig;

	public static void main(String[] args) {
		System.out.println("test");
		
		SpringApplication.run(SolarSystemApplication.class, args);
	}

	@Bean
	public PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
		return properties;
	}
}
