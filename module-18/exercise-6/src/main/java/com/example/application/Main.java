package com.example.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.Comparator;

import com.example.model.entities.Employee;


public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Enter file full path: ");
		String path = scanner.nextLine();
		
		System.out.print ("Enter salary: ");
		Double salary = scanner.nextDouble();
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))) {
		
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				list.add (new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				
				line = br.readLine();
				
			}
			
			List<String> emails = list.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted().collect(Collectors.toList());
			
			System.out.printf ("Email of people whose salary is more than %.2f:%n", salary);
			
			emails.forEach(System.out::println);
			
			double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x,y) -> x + y);
			
			System.out.printf ("Sum of salary of people whose name starts with 'M': %.2f%n", sum);
		
		} catch (IOException e) {
			System.out.println ("Error: " + e.getMessage());
		}
			
		scanner.close();
	}
}
