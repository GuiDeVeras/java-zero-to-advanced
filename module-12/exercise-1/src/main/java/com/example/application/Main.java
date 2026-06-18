package com.example.application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.example.entities.Worker;
import com.example.entities.enums.WorkerLevel;
import com.example.entities.Department;
import com.example.entities.HourContract;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main (String[] args) throws ParseException {
		Scanner scanner = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print ("Enter department's name: ");
		String department = scanner.nextLine();
		
		System.out.println ("Enter worker data: ");
		System.out.print ("Name: ");
		String name = scanner.nextLine();
		
		System.out.print ("Level: ");
		String level = scanner.nextLine();
		
		System.out.print ("Base salary: ");
		double baseSalary = scanner.nextDouble();		
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department (department));
		
		System.out.print ("How many contracts to this worker? ");
		int contracts = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < contracts; i++) {
			System.out.printf ("Enter contract #%d data", i+1);
			System.out.print ("Data (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scanner.next());
			
			System.out.print ("Value per hour: ");
			double value = scanner.nextDouble();
			
			System.out.print ("Duration (hours): ");
			int duration = scanner.nextInt();
			
			HourContract contract = new HourContract(contractDate, value, duration);
			worker.addContract(contract);
		}

		scanner.nextLine();
		System.out.print ("Enter month and year to calculate income (MM/YYYY): ");
		String newData = scanner.nextLine();
		int month = Integer.parseInt(newData.substring(0, 2));
		int year = Integer.parseInt(newData.substring(3));
		
		System.out.printf ("Name: %s%n", worker.getName());
		System.out.printf ("Department: %s%n", worker.getDepartment().getName());
		System.out.printf ("Income for %s: %.2f%n", newData, worker.income(year, month));
		
		scanner.close();
	}
}
