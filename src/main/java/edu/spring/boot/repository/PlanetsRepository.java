package edu.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.spring.boot.model.Planet;

public interface PlanetsRepository extends JpaRepository<Planet, Integer> {

}
