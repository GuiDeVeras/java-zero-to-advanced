package com.example.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

import com.example.entities.enums.WorkerLevel;
import com.example.entities.Department;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker () {
		
	}
	
	public Worker (String name, WorkerLevel level, double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public double getBaseSalary () {
		return baseSalary;
	}
	
	public void setBaseSalary (double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment (Department department) {
		this.department = department;
	}
	
	public List<HourContract> getContracts () {
		return contracts;
	}
	
	public WorkerLevel getWorkerLevel () {
		return level;
	}
	
	public void setWorkerLevel (WorkerLevel level) {
		this.level = level;
	}
	
	public void addContract (HourContract contract) {
		contracts.add (contract);
	}
	
	public void removeContract (HourContract contract) {
		contracts.remove (contract);
	}
	
	public double income (int year, int month) {
		double sum = baseSalary;
		Calendar calendar = Calendar.getInstance();
		for (HourContract x : contracts) {
			calendar.setTime(x.getDate());
			int x_year = calendar.get(Calendar.YEAR);
			int x_month = 1 + calendar.get(Calendar.MONTH);
			if (year == x_year && month == x_month) {
				sum += x.totalValue();
			}
		}
		return sum;
	}
	
}
