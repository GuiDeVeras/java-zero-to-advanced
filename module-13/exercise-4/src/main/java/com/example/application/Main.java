package com.example.application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.entities.TaxPayer;
import com.example.entities.Individual;
import com.example.entities.Company;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Enter the number of tax payers: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		List<TaxPayer> taxPayers = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			System.out.printf ("Tax payer #%d data:%n", i+1);
			System.out.print ("Individual or Company (i/c)? ");
			char answer = scanner.next().charAt(0);
			scanner.nextLine();
			
			TaxPayer x;
			
			if (answer == 'i') {
				System.out.print ("Name: ");
				String Name = scanner.nextLine();
				
				System.out.print ("Anual income: ");
				Double anualIncome = scanner.nextDouble();
				
				System.out.print ("Health expenditures: ");
				Double healthExpenditures = scanner.nextDouble();
				
				x = new Individual (Name, anualIncome, healthExpenditures);
			} else {
				System.out.print ("Name: ");
				String Name = scanner.nextLine();
				
				System.out.print ("Anual income: ");
				Double anualIncome = scanner.nextDouble();
				
				System.out.print ("Number of employees: ");
				Integer numberEmployees = scanner.nextInt();
				
				x = new Company (Name, anualIncome, numberEmployees);
			}
			
			scanner.nextLine();
			taxPayers.add (x);
			
		}
		
		double sum = 0;
		
		System.out.printf ("%nTAXES PAID:%n");
		for (TaxPayer x : taxPayers) {
			System.out.printf ("%s: $ $%.2f%n", x.getName(), x.totalTaxes());
			sum += x.totalTaxes();
		}
	
		System.out.printf ("TOTAL TAXES: $ %.2f%n", sum);
		
		scanner.close();
	}
}
