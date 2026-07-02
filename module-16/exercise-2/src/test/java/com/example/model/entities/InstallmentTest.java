package com.example.model.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class InstallmentTest {

    	private Installment installment;

    	@BeforeEach
    	void setUp() {
        	installment = new Installment(LocalDate.of(2026, 6, 20), 500.0);
    	}

    	@Test
    	void emptyConstructor() {
		Installment empty = new Installment();
		
		assertNull(empty.getDueDate());
		assertNull(empty.getAmount());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals(LocalDate.of(2026, 6, 20), installment.getDueDate());
		assertEquals(500.0, installment.getAmount());
    	}

    	@Test
    	void setDueDate() {
		installment.setDueDate(LocalDate.of(2026, 7, 20));
		
		assertEquals(LocalDate.of(2026, 7, 20), installment.getDueDate());
    	}

    	@Test
    	void setAmount() {
        	installment.setAmount(750.0);
        	
        	assertEquals(750.0, installment.getAmount());
    	}

    	@Test
    	void toStringFormat() {
        	assertEquals("20/06/2026 - 500,00", installment.toString());
    	}
}
