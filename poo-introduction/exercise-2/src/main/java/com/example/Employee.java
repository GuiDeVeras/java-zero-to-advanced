package com.example;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary () {
		double result = grossSalary - tax;
		return result;
	}
	
	public double increaseSalary (double bonus) {
		double result = netSalary() + (grossSalary * bonus * 0.01);
		return result;
	}
	
}
