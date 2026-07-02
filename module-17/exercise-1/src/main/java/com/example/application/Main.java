package com.example.application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.example.entities.Shape;
import com.example.entities.Rectangle;
import com.example.entities.Circle;

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
			
			Shape x;
			
			if (answer == 'r') {
				System.out.print ("Width: ");
				Double width = scanner.nextDouble();
				
				System.out.print ("Height: ");
				Double height = scanner.nextDouble();
				
				x = new Rectangle (width, height);
			} else {
				System.out.print ("Radius: ");
				Double radius = scanner.nextDouble();
				
				x = new Circle (radius);
			}
			
			scanner.nextLine();
			shapes.add (x);
			
		}
		
		System.out.printf ("%nTotal area: %.2f%n", totalArea(shapes));
		
		scanner.close();
	}
	
	public static double totalArea (List<? extends Shape> list)  {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
