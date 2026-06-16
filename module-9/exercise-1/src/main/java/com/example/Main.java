package com.example;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter account number: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print ("Enter account holder: ");
		String name = scanner.nextLine();
		
		System.out.print ("Is there any initial deposit (y/n)? ");
		char answer = scanner.next().charAt(0);
		
		BankAcc acc;
		
		if (answer == 'y') {
			System.out.print ("Enter initial deposit value: ");
			double deposit = scanner.nextDouble();
			acc = new BankAcc(number, name, deposit);
		} else {
			acc = new BankAcc(number, name);
		}
		
		System.out.printf ("%nAccount data:%n");
		System.out.printf(acc.accData());
		
		System.out.print ("Enter a deposit value: ");
		double amount = scanner.nextDouble();
		acc.deposit (amount);
		
		System.out.println ("Updated account data:");
		System.out.printf(acc.accData());
		
		System.out.print ("Enter a withdraw value: ");
		amount = scanner.nextDouble();
		acc.withdraw (amount);
		
		System.out.println ("Updated account data: ");
		System.out.printf(acc.accData());
		
		scanner.close();
	}
}
