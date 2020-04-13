package edu.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.boot.model.Planet;
import edu.spring.boot.model.SolarSystem;
import edu.spring.boot.repository.PlanetsRepository;
import edu.spring.boot.repository.SolarSystemRepository;

@Service
public class SolarSystemServiceImpl implements SolarSystemService {

	@Autowired
	private SolarSystemRepository solarSystemRepository;

	@Autowired
	private PlanetsRepository planetsRepository;

	public SolarSystem getInformation() {
		SolarSystem record = null;
		Iterable<SolarSystem> records = solarSystemRepository.findAll();
		if (records != null && records.iterator() != null && records.iterator().hasNext()) {
			record = records.iterator().next();
		}
		return record;
	}

	@Override
	public List<Planet> getAllPlanets() {
		List<Planet> planets = planetsRepository.findAll();
		return planets;
	}
}
