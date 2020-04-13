package edu.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.spring.boot.model.Planet;
import edu.spring.boot.model.SolarSystem;
import edu.spring.boot.service.SolarSystemService;

@Controller
public class SolarSystemController {

	@Autowired
	private SolarSystemService solarSystemService;

	@GetMapping("info")
	public ModelAndView getSolarSystemInfo() {

		SolarSystem solarSystem = solarSystemService.getInformation();
		ModelAndView model = new ModelAndView();
		model.addObject("solarSystem", solarSystem);
		model.setViewName("solarSystem");
		return model;
	}

	@GetMapping("planets")
	public ModelAndView getAllPlaets() {
		List<Planet> planets = solarSystemService.getAllPlanets();
		ModelAndView model = new ModelAndView();
		model.addObject("planets", planets);
		model.setViewName("planets");
		return model;

	}
}
