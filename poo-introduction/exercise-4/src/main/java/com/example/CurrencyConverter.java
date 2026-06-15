package com.example;

public class CurrencyConverter {
	
	public static double dolarToReal (double dolarPrice, double amount) {
		double result = amount * dolarPrice * 1.06;
		return result;
	}
	
	
}
