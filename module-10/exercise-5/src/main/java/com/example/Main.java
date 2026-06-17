package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		int[][] matrix = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int o = 0; o < N; o++) {
				matrix[i][o] = scanner.nextInt();
			}
		}
		
		int X = scanner.nextInt();
		
		for (int i = 0; i < M; i++) {
			for (int o = 0; o < N; o++) {
				if (matrix[i][o] == X) {
					if (i == 0) { 
						if (o == 0) {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Right: %d%n", matrix[i][o+1]);;
							System.out.printf ("Down: %d%n", matrix[i+1][o]);
						}
						else if (o == N-1) {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Right: %d%n", matrix[i][o+1]);
							System.out.printf ("Up: %d%n", matrix[i-1][o]);
						} else {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Left: %d%n", matrix[i][o-1]);
							System.out.printf ("Right: %d%n", matrix[i][o+1]);
							System.out.printf ("Down: %d%n", matrix[i+1][o]);
						}
					} else if (i == M-1) {
						if (o == 0) {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Left: %d%n", matrix[i][o-1]);
							System.out.printf ("Down: %d%n", matrix[i+1][o]);
						}
						else if (o == N-1) {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Left: %d%n", matrix[i][o-1]);
							System.out.printf ("Up: %d%n", matrix[i-1][o]);
						} else {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Left: %d%n", matrix[i][o-1]);
							System.out.printf ("Up: %d%n", matrix[i-1][o]);
							System.out.printf ("Down: %d%n", matrix[i+1][o]);
						}
					} else if (i != 0 && i != M-1) {
						if (o == 0) {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Right: %d%n", matrix[i][o+1]);
							System.out.printf ("Up: %d%n", matrix[i-1][o]);
							System.out.printf ("Down: %d%n", matrix[i+1][o]);
						} else if (o == N-1) {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Left: %d%n", matrix[i][o-1]);
							System.out.printf ("Up: %d%n", matrix[i-1][o]);
							System.out.printf ("Down: %d%n", matrix[i+1][o]);
						} else {
							System.out.printf ("Position %d,%d:%n", i, o);
							System.out.printf ("Left: %d%n", matrix[i][o-1]);
							System.out.printf ("Right: %d%n", matrix[i][o+1]);
							System.out.printf ("Up: %d%n", matrix[i-1][o]);
							System.out.printf ("Down: %d%n", matrix[i+1][o]);
						}
					}
				}
			}
		}
		
		scanner.close();
	}
}

						
