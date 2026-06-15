package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

	@Test
	void TwoInt() {
		double dolarPrice = 5.00;
		double amount = 31.00;
        
        	assertEquals(CurrencyConverter.dolarToReal(dolarPrice, amount), 164.30, 0.001);
    	}

	@Test
	void OneDecimal() {
		double dolarPrice = 5.46;
		double amount = 31.00;
        
        	assertEquals(CurrencyConverter.dolarToReal(dolarPrice, amount), 179.4156, 0.001);
	}
}
