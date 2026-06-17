package com.example;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("How many rooms will be rented? ");
		int N = scanner.nextInt();
		scanner.nextLine();
		
		Renter[] vector = new Renter[N];
		
		for (int i = 0; i < N; i++) {
			vector[i] = new Renter();
			
			System.out.printf ("%nRend #%d:%n", i+1);
			System.out.print ("Name: ");
			String name = scanner.nextLine();
			vector[i].setName(name);

			System.out.print ("Email: ");
			String email = scanner.nextLine();
			vector[i].setEmail(email);
			
			System.out.print ("Room: ");
			int room = scanner.nextInt();
			scanner.nextLine();
			vector[i].setRoom(room);
			
		}
		
		System.out.println ("");
		
		for (int i = 0; i < N; i++) {
			System.out.printf ("%d: %s, %s%n", vector[i].getRoom(), vector[i].getName(), vector[i].getEmail());
		}
		
		scanner.close();
	}
}
