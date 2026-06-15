package com.example;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);

		Student x;
		x = new Student();
		
		x.name = scanner.nextLine();
		x.grade1 = scanner.nextDouble();
		x.grade2 = scanner.nextDouble();
		x.grade3 = scanner.nextDouble();
		
		if (x.finalGrade() >= 60) System.out.printf("FINAL GRADE = %.2f%nPASS%n", x.finalGrade());
		else System.out.printf("FINAL GRADE = %.2f%nFAILED%nMISSING %.2f POINTS%n", x.finalGrade(), 60 - x.finalGrade());
		
		scanner.close();
	}
}
