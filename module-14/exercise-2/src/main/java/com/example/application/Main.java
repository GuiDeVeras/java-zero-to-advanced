package com.example.application;

import java.util.Scanner;

import com.example.model.entities.Account;
import com.example.model.exceptions.DomainException;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		try {
			System.out.println ("Enter account data:");
			
			System.out.print ("Number: ");
			int number = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print ("Holder: ");
			String holder = scanner.nextLine();
			
			System.out.print ("Initial balance: ");
			double initialBalance = scanner.nextDouble();
			
			System.out.print ("Withdraw limit: ");
			double withdrawLimit = scanner.nextDouble();
			
			Account account = new Account (number, holder, initialBalance, withdrawLimit);
			
			System.out.printf ("%nEnter amount for withdraw: ");
			double amount = scanner.nextDouble();
			
			account.withdraw(amount);
			System.out.printf ("New balance: %.2f%n", account.getBalance());
							
		}
		catch (DomainException e) {
			System.out.println ("Withdraw error: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println ("Unexpected error");
		}
		
		
		
		
		
		scanner.close();
	}
}
