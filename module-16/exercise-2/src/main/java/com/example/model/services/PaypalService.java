package com.example.model.services;	

public class PaypalService implements OnlinePaymentService {
	
	public double paymentFee (Double amount) {
		return amount *= 1.02;
	}
	
	public double interest (Double amount, Integer months) {
		return amount += (amount * 0.01) * months;
	}
	
}
