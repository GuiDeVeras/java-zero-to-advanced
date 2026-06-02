package com.example;

public class Exercise {
	public void area (double a, double b, double c) {
		double triangle, circule, trapezium, square, rectangle;
		triangle = (a * c) / 2f;
		circule = 3.14159 * Math.pow(c, 2f);
		trapezium = (a + b) * c / 2f;
		square = b * b;
		rectangle = a * b;
		System.out.printf("Triangle = %.3f%nCircule = %.3f%nTrapezium = %.3f%nSquare = %.3f%nRectangle = %.3f%n", triangle, circule, trapezium, square, rectangle);
		return;
	}
}
