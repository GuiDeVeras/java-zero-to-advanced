package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("How many employees will be registered? ");
		int N = scanner.nextInt();
		scanner.nextLine();
		
		List<Worker> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			
			System.out.printf ("%nEmployee #%d:%n", i+1);
			System.out.print ("Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();

			System.out.print ("Name: ");
			String name = scanner.nextLine();
			
			System.out.print ("Salary: ");
			double salary = scanner.nextDouble();
			scanner.nextLine();
			
			list.add (new Worker (id, name, salary));
			
		}
		
		WorkerManager manager = new WorkerManager (list);
		
		System.out.printf ("%nEnter the employee id that will have salary increase: ");
		int id = scanner.nextInt();
		
		if (manager.findId(id)) {
			System.out.print ("Enter the percentage: ");
			double percentage = scanner.nextDouble();
			manager.findById(id).get().increaseSalary(percentage);
			System.out.println ("");
		} else System.out.printf ("This id does not exist!%n%n");
		
		for (Worker x : list) {
			System.out.printf ("%d: %s, %.2f%n", x.getId(), x.getName(), x.getSalary());
		}
		
		scanner.close();
	}
}
