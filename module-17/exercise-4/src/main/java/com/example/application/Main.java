package com.example.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Date;
import java.time.Instant;

import com.example.model.entities.LogEntry;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Enter file full path: ");
		String path = scanner.nextLine();
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))) {
		
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add (new LogEntry (username, moment));
				
				line = br.readLine();
				
			}
			
			System.out.printf ("Total users: %d%n", set.size());
		
		} catch (IOException e) {
			System.out.println ("Error: " + e.getMessage());
		}
			
		scanner.close();
	}
}
