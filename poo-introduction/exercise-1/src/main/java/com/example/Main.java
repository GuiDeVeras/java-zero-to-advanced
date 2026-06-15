package com.example;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println ("Enter rectangle width and height:");
		
		Rectangle x;
		x = new Rectangle();
		
		x.width = scanner.nextDouble();
		x.height = scanner.nextDouble();
		
		System.out.printf("AREA = %.2f%n", x.area());
		System.out.printf("PERIMETER = %.2f%n", x.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", x.diagonal());
		
		scanner.close();
	}
}
