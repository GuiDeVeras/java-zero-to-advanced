package com.example.application;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import com.example.model.entities.Installment;
import com.example.model.entities.Contract;
import com.example.model.services.PaypalService;
import com.example.model.services.ContractService;
import com.example.model.services.OnlinePaymentService;

public class Main {
	public static void main (String[] args) throws ParseException {
		Scanner scanner = new Scanner (System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println ("Enter the contract data");
		System.out.print ("Number: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print ("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(scanner.nextLine(), fmt);
		
		System.out.print ("Contract value: ");
		double contractValue = scanner.nextDouble();
		
		Contract contract = new Contract (number, date, contractValue);
			
		System.out.print ("Enter the number of installments: ");
		int numberInstallments = scanner.nextInt();
			
		ContractService service = new ContractService (new PaypalService());
			
		service.processContract(contract, numberInstallments);
		
		System.out.printf ("%nINSTALLMENTS:%n");
		
		for (Installment x : contract.getInstallment()) {
			System.out.printf ("%s%n", x);
		}
			
		scanner.close();
	}
}
