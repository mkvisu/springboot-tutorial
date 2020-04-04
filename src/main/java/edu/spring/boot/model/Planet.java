package edu.spring.boot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

public class Planet {
	private String name;
	private int perimeter;
	private String shape;

	public Planet(String name, int perimeter, String shape) {
		this.name = name;
		this.perimeter = perimeter;
		this.shape = shape;
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
