package edu.spring.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import edu.spring.boot.model.Planet;

@Configuration
@PropertySource({ "classpath:solar-system.properties" })
public class SolarSystemConfig {

	@Value("${solar.planet.name}")
	private String name;
	@Value("${solar.planet.perimeter}")
	private int perimeter;
	@Value("${solar.planet.shape}")
	private String shape;

	@Autowired
	private Environment env;

	@Bean
	public Planet planet() {
		Planet planet = new Planet(name, perimeter, shape);
		planet.setName(env.getProperty("solar.planet.name"));
		return planet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
