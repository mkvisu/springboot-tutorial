package edu.spring.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solarsystem")
public class SolarSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String located;

	@Column(name = "num_planets")
	private Integer numOfPlanets;

	@Column(name = "num_moons")
	private Integer numOfMoons;

	private float formed;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocated() {
		return located;
	}

	public void setLocated(String located) {
		this.located = located;
	}

	public Integer getNumOfPlanets() {
		return numOfPlanets;
	}

	public void setNumOfPlanets(Integer numOfPlanets) {
		this.numOfPlanets = numOfPlanets;
	}

	public Integer getNumOfMoons() {
		return numOfMoons;
	}

	public void setNumOfMoons(Integer numOfMoons) {
		this.numOfMoons = numOfMoons;
	}

	public float getFormed() {
		return formed;
	}

	public void setFormed(float formed) {
		this.formed = formed;
	}

}
