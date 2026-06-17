package com.example;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("How many people are going to be digited? ");
		int N = scanner.nextInt();
		scanner.nextLine();
		
		double sum = 0;
		int minors = 0;
		Person[] vector = new Person[N];
		
		for (int i = 0; i < N; i++) {
			System.out.printf ("Data of the %da person%n", i+1);
			System.out.printf ("Name: ");
			String name = scanner.nextLine();
			
			System.out.printf ("Age: ");
			int age = scanner.nextInt();
			
			System.out.printf ("Height: ");
			double height = scanner.nextDouble();
			scanner.nextLine();
			
			vector[i] = new Person(name, age, height);
			sum += vector[i].getHeight();
			if (vector[i].getAge() < 16) minors += 1;
		}
		
		System.out.printf ("Height average: %.2f%n", sum / N);
		System.out.printf ("People below 16 years old: %d / %d%n", minors, N);
		
		
		for (int i = 0; i < N; i++) {
			if (vector[i].getAge() < 16) System.out.printf ("%s%n", vector[i].getName());
		}
		
		scanner.close();
	}
}
