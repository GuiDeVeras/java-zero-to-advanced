package com.example.model.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ContractTest {

   	private Contract contract;

    	@BeforeEach
    	void setUp() {
        	contract = new Contract(1, LocalDate.of(2026, 1, 1), 1000.0);
    	}

    	@Test
    	void emptyConstructor() {
		Contract empty = new Contract();
		
		assertNull(empty.getNumber());
		assertNull(empty.getDate());
		assertNull(empty.getTotalValue());
		assertTrue(empty.getInstallment().isEmpty());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals(1, contract.getNumber());
		assertEquals(LocalDate.of(2026, 1, 1), contract.getDate());
		assertEquals(1000.0, contract.getTotalValue());
		assertTrue(contract.getInstallment().isEmpty());
    	}

    	@Test
    	void setNumber() {
        	contract.setNumber(2);
        	
        	assertEquals(2, contract.getNumber());
    	}

    	@Test
    	void setDate() {
		contract.setDate(LocalDate.of(2026, 6, 15));
		
		assertEquals(LocalDate.of(2026, 6, 15), contract.getDate());
    	}

    	@Test
    	void setTotalValue() {
		contract.setTotalValue(2000.0);
		
		assertEquals(2000.0, contract.getTotalValue());
    	}

    	@Test
    	void installmentsListStartsEmpty() {
        	assertEquals(0, contract.getInstallment().size());
    	}
}
