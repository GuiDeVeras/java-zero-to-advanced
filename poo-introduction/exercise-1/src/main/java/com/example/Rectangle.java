package com.example;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area () {
		double result = width * height;
		return result;
	}
	
	public double perimeter () {
		double result = (2 * width) + (2 * height);
		return result;
	}
	
	public double diagonal () {
		double result = Math.sqrt((width * width) + (height * height));
		return result;
	}
}
