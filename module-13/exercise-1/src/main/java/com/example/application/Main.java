package com.example.application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.entities.OutsourcedEmployee;
import com.example.entities.Employee;


public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Enter the number of employees: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		List<Employee> workers = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			System.out.printf ("Employee #%d data:%n", i+1);
			System.out.print ("Outsorced (y/n)? ");
			char answer = scanner.next().charAt(0);
			scanner.nextLine();
			
			System.out.print ("Name: ");
			String name = scanner.nextLine();
			
			System.out.print ("Hours: ");
			int hours = scanner.nextInt();
			
			System.out.print ("Value per hours: ");
			double valuePerHour = scanner.nextDouble();
			
			Employee x;
			
			if (answer == 'n') {
				x = new Employee(name, hours, valuePerHour);
			} else {
				System.out.print ("Additional charge: ");
				double additionalCharge = scanner.nextDouble();
				x = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			}
			
			scanner.nextLine();
			workers.add (x);
			
		}
		
		System.out.printf ("%nPAYMENTS:%n");
		for (Employee x : workers) {
			System.out.printf ("%s - $ %.2f%n", x.getName(), x.payment());
		}
		
		scanner.close();
	}
}
