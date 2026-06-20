package com.example.application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.entities.Shape;
import com.example.entities.Rectangle;
import com.example.entities.Circle;
import com.example.entities.enums.Color;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Enter the number of shapes: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		List<Shape> shapes = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			System.out.printf ("Shape #%d data:%n", i+1);
			System.out.print ("Rectangle or Circle (r/c)? ");
			char answer = scanner.next().charAt(0);
			scanner.nextLine();
			
			System.out.print ("Color (BLACK/BLUE/RED): ");
			String color = scanner.nextLine();
			
			Shape x;
			
			if (answer == 'r') {
				System.out.print ("Width: ");
				Double width = scanner.nextDouble();
				
				System.out.print ("Height: ");
				Double height = scanner.nextDouble();
				
				x = new Rectangle (Color.valueOf(color), width, height);
			} else {
				System.out.print ("Radius: ");
				Double radius = scanner.nextDouble();
				
				x = new Circle (Color.valueOf(color), radius);
			}
			
			scanner.nextLine();
			shapes.add (x);
			
		}
		
		System.out.printf ("%nSHAPE AREAS:%n");
		for (Shape x : shapes) {
			System.out.printf ("%.2f%n", x.area());
		}
		
		scanner.close();
	}
}
