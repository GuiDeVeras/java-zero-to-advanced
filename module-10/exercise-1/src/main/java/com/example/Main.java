package com.example;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("How many numbers are you going to digit? ");
		int numbers = scanner.nextInt();
		
		int[] vector = new int[numbers];
		
		for (int i = 0; i < numbers; i++) {
			System.out.print ("Digit a number: ");
			vector[i] = scanner.nextInt();
		}
		
		System.out.println ("Negative Numbers:");
		
		for (int i = 0; i < numbers; i++) {
			if (vector[i] < 0) System.out.printf ("%d%n", vector[i]);
		}
		
		scanner.close();
	}
}
