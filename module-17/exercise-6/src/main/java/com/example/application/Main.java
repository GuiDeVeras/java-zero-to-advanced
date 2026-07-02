package com.example.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print ("Enter file full path: ");
		String path = scanner.nextLine();
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))) {
		
			Map<String, Integer> map = new LinkedHashMap<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String username = fields[0];
				int votes = Integer.parseInt(fields[1]);
				
				if (map.containsKey (username)) {
					map.put (username, votes + map.get(username));	
				} else map.put (username, votes);
				
				line = br.readLine();
				
			}
			
			for (String key : map.keySet()) {
				System.out.printf ("%s: %d%n", key, map.get(key));
			}
		
		} catch (IOException e) {
			System.out.println ("Error: " + e.getMessage());
		}
			
		scanner.close();
	}
}
