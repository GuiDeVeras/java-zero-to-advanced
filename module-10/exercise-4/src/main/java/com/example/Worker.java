package com.example;

public class Worker {
	
	private int id;
	private String name;
	private double salary;
	
	public Worker (int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId () {
		return id;
	}
	public void setId (int id) {
		this.id = id;
	}
	
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public double getSalary () {
		return salary;
	}
	
	public void increaseSalary (double percentage) {
		this.salary *= (percentage * 0.01) + 1;
	}
	
}
