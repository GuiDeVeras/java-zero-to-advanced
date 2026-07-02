package com.example.model.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaypalServiceTest {

    	private final PaypalService paypal = new PaypalService();

    	@Test
    	void paymentFeeAdds2Percent() {
        	assertEquals(102.0, paypal.paymentFee(100.0), 0.001); 
    	}

    	@Test
    	void interestFor1Month() {
        	assertEquals(101.0, paypal.interest(100.0, 1), 0.001); 
    	}

    	@Test
    	void interestFor3Months() {
        	assertEquals(103.0, paypal.interest(100.0, 3), 0.001); 
    	}

    	@Test
    	void interestFor12Months() {
        	assertEquals(112.0, paypal.interest(100.0, 12), 0.001);
    	}
}
