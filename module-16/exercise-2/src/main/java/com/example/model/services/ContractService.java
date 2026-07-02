package com.example.model.services;	

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.model.entities.Contract;
import com.example.model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService (OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract (Contract contract, Integer months) {
		
		for (int i = 1; i <= months; i++) {
			double amount = contract.getTotalValue() / months;
			amount = onlinePaymentService.paymentFee(onlinePaymentService.interest(amount, i));
			contract.getInstallment().add (new Installment (contract.getDate().plusMonths(i), amount));
		}
	}
	
}
