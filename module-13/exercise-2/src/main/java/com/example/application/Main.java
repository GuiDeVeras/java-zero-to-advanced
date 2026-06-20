package com.example.application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import com.example.entities.Product;
import com.example.entities.ImportedProduct;
import com.example.entities.UsedProduct;

public class Main {
	public static void main (String[] args) throws ParseException {
		Scanner scanner = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print ("Enter the number of products: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		List<Product> products = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			System.out.printf ("Product #%d data:%n", i+1);
			System.out.print ("Common, used or imported (c/u/i)? ");
			char answer = scanner.next().charAt(0);
			scanner.nextLine();
			
			System.out.print ("Name: ");
			String name = scanner.nextLine();
			
			System.out.print ("Price: ");
			double price = scanner.nextDouble();
			
			Product x;
			
			if (answer == 'c') {
				x = new Product(name, price);
			} else if (answer == 'i') {
				System.out.print ("Customs fee: ");
				double customsFee = scanner.nextDouble();
				x = new ImportedProduct(name, price, customsFee);
			} else {
				System.out.print ("Manufacture date (DD/MM/YYYY): ");
				scanner.nextLine();
				Date date = sdf.parse(scanner.next());
				x = new UsedProduct(name, price, date);
			}
			
			scanner.nextLine();
			products.add (x);
			
		}
		
		System.out.printf ("%nPRICE TAGS:%n");
		for (Product x : products) {
			System.out.printf ("%s", x.priceTag());
		}
		
		scanner.close();
	}
}
