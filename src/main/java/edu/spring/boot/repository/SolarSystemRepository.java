package edu.spring.boot.repository;

import org.springframework.data.repository.CrudRepository;

import edu.spring.boot.model.SolarSystem;

public interface SolarSystemRepository extends CrudRepository<SolarSystem, Integer>{

}
