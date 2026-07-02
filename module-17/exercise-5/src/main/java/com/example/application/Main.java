package com.example.application;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print ("How many students for course A? ");
		int A = scanner.nextInt();
		for (int i = 0; i < A; i++) {
			courseA.add (scanner.nextInt());
		}
		
		System.out.print ("How many students for course B? ");
		int B = scanner.nextInt();
		for (int i = 0; i < B; i++) {
			courseB.add (scanner.nextInt());
		}
		
		System.out.print ("How many students for course C? ");
		int C = scanner.nextInt();
		for (int i = 0; i < C; i++) {
			courseC.add (scanner.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		
		System.out.printf ("Total students: %d%n", total.size());
			
		scanner.close();
	}
}
