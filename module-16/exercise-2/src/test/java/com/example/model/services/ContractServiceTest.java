package com.example.model.services;

import com.example.model.entities.Contract;
import com.example.model.entities.Installment;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ContractServiceTest {

    	private ContractService contractService;
    	private Contract contract;

    	@BeforeEach
    	void setUp() {
		contractService = new ContractService(new PaypalService());
		contract = new Contract(1, LocalDate.of(2026, 1, 1), 1200.0);
    	}

    	@Test
    	void processContractGeneratesCorrectNumberOfInstallments() {
		contractService.processContract(contract, 3);
		assertEquals(3, contract.getInstallment().size());
    	}

    	@Test
    	void processContractDueDatesAreCorrect() {
		contractService.processContract(contract, 3);

		assertEquals(LocalDate.of(2026, 2, 1), contract.getInstallment().get(0).getDueDate());
		assertEquals(LocalDate.of(2026, 3, 1), contract.getInstallment().get(1).getDueDate());
		assertEquals(LocalDate.of(2026, 4, 1), contract.getInstallment().get(2).getDueDate());
    	}

    	@Test
    	void processContractFirstInstallmentAmount() {
		contractService.processContract(contract, 3);

		assertEquals(412.08, contract.getInstallment().get(0).getAmount(), 0.001);
    	}

    	@Test
    	void processContractLastInstallmentAmount() {
		contractService.processContract(contract, 3);

		assertEquals(420.24, contract.getInstallment().get(2).getAmount(), 0.001);
    	}

    	@Test
    	void processContractWithOneInstallment() {
		contractService.processContract(contract, 1);

		assertEquals(1, contract.getInstallment().size());

		assertEquals(1236.24, contract.getInstallment().get(0).getAmount(), 0.001);
    	}
}
