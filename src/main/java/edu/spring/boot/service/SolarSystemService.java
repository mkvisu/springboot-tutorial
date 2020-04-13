package edu.spring.boot.service;

import java.util.List;

import edu.spring.boot.model.Planet;
import edu.spring.boot.model.SolarSystem;

public interface SolarSystemService {
	public SolarSystem getInformation();
	public List<Planet> getAllPlanets();
}
