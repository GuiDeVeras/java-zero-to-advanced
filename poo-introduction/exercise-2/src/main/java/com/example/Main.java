package com.example;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);

		Employee x;
		x = new Employee();

		System.out.print ("Name: ");		
		x.name = scanner.nextLine();
		
		System.out.print ("Gross salary: ");		
		x.grossSalary = scanner.nextDouble();
		
		System.out.print ("Tax: ");		
		x.tax = scanner.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", x.name, x.netSalary());
		
		System.out.printf("Which percentage to increase salary? ");
		double bonus = scanner.nextDouble();
		
		System.out.printf("Update data: %s, $ %.2f%n", x.name, x.increaseSalary(bonus));
		
		scanner.close();
	}
}
