package com.example.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.example.entities.Order;
import com.example.entities.OrderItem;
import com.example.entities.Product;
import com.example.entities.Client;
import com.example.entities.enums.OrderStatus;

public class Main {
	public static void main (String[] args) throws ParseException{
		Scanner scanner = new Scanner (System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println ("Enter client data:");
		System.out.print ("Name: ");
		String name = scanner.nextLine();
		
		System.out.print ("Email: ");
		String email = scanner.nextLine();
		
		System.out.print ("Birth date (DD/MM/YYYY): ");
		Date date = sdf1.parse(scanner.next());
		scanner.nextLine();
		
		System.out.println ("Enter order data:");
		System.out.print ("Status: ");
		String status = scanner.nextLine();
		
		Order order = new Order (new Date(), OrderStatus.valueOf(status), new Client (name, email, date));
		
		System.out.print ("How many items to this order? ");
		int itemsNumber = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 0; i < itemsNumber; i++) {
			System.out.printf ("Enter #%d item data%n", i+1);
			System.out.print ("Product name: ");
			String productName = scanner.nextLine();
			
			System.out.print ("Product price: ");
			double productPrice = scanner.nextDouble();
			
			System.out.print ("Quantity: ");
			int productQuantity = scanner.nextInt();
			scanner.nextLine();
			
			OrderItem item = new OrderItem (productQuantity, productPrice, new Product (productName, productPrice));
			order.addItem(item);
		}
		
		System.out.printf ("%nORDER SUMMARY:%n");
		System.out.print ("Order moment: " + sdf.format(order.getMoment()) + "\n");
		System.out.print ("Order status: " + order.getStatus() + "\n");
		System.out.print ("Client: " + order.getClient().getName() + " (" + sdf1.format(order.getClient().getBirthDate()) + ") - " + order.getClient().getEmail() + "\n");
		System.out.println ("Order items:");
		
		for (OrderItem x : order.getItems()) {
			System.out.printf ("%s, $%.2f, Quantity: %d, Subtotal: $%.2f%n", x.getProduct().getName(), x.getPrice(), x.getQuantity(), x.subTotal());
		}
		
		System.out.printf ("Total price: $%.2f%n", order.total());
		
		
		scanner.close();
	}
}
