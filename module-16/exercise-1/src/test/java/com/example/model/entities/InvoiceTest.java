package com.example.model.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    	private Invoice invoice;

    	@BeforeEach
    	void setUp() {
        	invoice = new Invoice(100.0, 20.0);
    	}

    	@Test
    	void emptyConstructor() {
		Invoice empty = new Invoice();

		assertNull(empty.getBasicPayment());
		assertNull(empty.getTax());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals(100.0, invoice.getBasicPayment());
		assertEquals(20.0, invoice.getTax());
    	}

    	@Test
    	void setBasicPayment() {
		invoice.setBasicPayment(150.0);
		
		assertEquals(150.0, invoice.getBasicPayment());
    	}

	@Test
    	void setTax() {
		invoice.setTax(30.0);
		
		assertEquals(30.0, invoice.getTax());
    	}

    	@Test
    	void totalPaymentCalculation() {
        	assertEquals(120.0, invoice.getTotalPayment(), 0.001);
    	}
}
