package com.example.entities;

public class Circle implements Shape {
	
	private Double radius;
	
	public Circle () {
		super();
	}
	
	public Circle (Double radius) {
		super();
		this.radius = radius;
	}
	
	public Double getRadius () {
		return radius;
	}
	public void setRadius (Double radius) {
		this.radius = radius;
	}
	
	@Override
	public final double area() {
		return Math.PI * radius * radius;
	}

}
