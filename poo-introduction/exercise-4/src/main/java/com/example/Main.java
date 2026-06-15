package com.example;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("What is the dollar price? ");
		double dolarPrice = scanner.nextDouble();
		
		System.out.print ("How many dollar will be bought? ");
		double amount = scanner.nextDouble();
		
		System.out.printf ("Amount to be paid in reais = %.2f%n", CurrencyConverter.dolarToReal (dolarPrice, amount));
		
		scanner.close();
	}
}
