package com.example.model.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BrazilTaxServiceTest {

    	private final BrazilTaxService taxService = new BrazilTaxService();

    	@Test
    	void taxBelowOrEqual100() {
        	assertEquals(20.0, taxService.tax(100.0), 0.001);
    	}

    	@Test
    	void taxAbove100() {
        	assertEquals(30.0, taxService.tax(200.0), 0.001); 
    	}

    	@Test
    	void taxAtBoundary() {
        	assertEquals(20.0, taxService.tax(100.0), 0.001); 
    	}

    	@Test
    	void taxJustAboveBoundary() {
        	assertEquals(15.015, taxService.tax(100.1), 0.001);
    	}
}
