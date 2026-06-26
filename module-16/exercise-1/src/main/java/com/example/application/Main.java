package com.example.application;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.example.model.entities.Vehicle;
import com.example.model.entities.Invoice;
import com.example.model.entities.CarRental;
import com.example.model.services.BrazilTaxService;
import com.example.model.services.RentalService;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println ("Enter the rent data");
		System.out.print ("Car model: ");
		String carModel = scanner.nextLine();
		
		System.out.print ("Withdrawal (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);
		
		System.out.print ("Return (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);
			
		CarRental carRental = new CarRental (start, finish, new Vehicle (carModel));
		
		System.out.print ("Enter the price per hour: ");
		Double pricePerHour = scanner.nextDouble();
			
		System.out.print ("Enter the price per day: ");
		Double pricePerDay = scanner.nextDouble();
			
		RentalService rentalService = new RentalService (pricePerHour, pricePerDay, new BrazilTaxService());
			
		rentalService.processInvoice(carRental);
		
		System.out.printf ("%nINVOICE:%n");
		System.out.printf ("Basic payment: %.2f%n", carRental.getInvoice().getBasicPayment());
		System.out.printf ("Tax: %.2f%n", carRental.getInvoice().getTax());
		System.out.printf ("Total payment: %.2f%n", carRental.getInvoice().getTotalPayment());
			
		scanner.close();
	}
}
