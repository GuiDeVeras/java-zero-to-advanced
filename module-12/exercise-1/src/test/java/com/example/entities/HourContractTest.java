package com.example.entities;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class HourContractTest {
	
	@Test
	void emptyConstructor() {
		HourContract contract = new HourContract();
		assertNull(contract.getDate());
		assertNull(contract.getValuePerHour());
		assertNull(contract.getHours());
	}

    	@Test
    	void constructorWithParameters() {
        	Date date = new Date();
        	HourContract contract = new HourContract(date, 50.00, 9);
        	
        	assertEquals(date, contract.getDate());
        	assertEquals(50.00, contract.getValuePerHour());
        	assertEquals(9, contract.getHours());
    	}
    	
    	@Test
   	void setDate() {
		HourContract contract = new HourContract();
		Date date = new Date();
		contract.setDate(date);
		assertEquals(date, contract.getDate());
    	}

    	@Test
    	void setValuePerHour() {
		HourContract contract = new HourContract();
		contract.setValuePerHour(75.5);
		assertEquals(75.5, contract.getValuePerHour());
	}

    	@Test
    	void setHours() {
		HourContract contract = new HourContract();
		contract.setHours(20);
		assertEquals(20, contract.getHours());
    	}

    	@Test
    	void totalValueCalculation() {
		HourContract contract = new HourContract(new Date(), 50.0, 10);
		assertEquals(500.0, contract.totalValue(), 0.001);
    	}

    	@Test
    	void totalValueWithZeroHours() {
		HourContract contract = new HourContract(new Date(), 50.0, 0);
		assertEquals(0.0, contract.totalValue(), 0.001);
    	}

    	@Test
    	void totalValueWithDecimalRate() {
		HourContract contract = new HourContract(new Date(), 33.33, 3);
		assertEquals(99.99, contract.totalValue(), 0.001);
    	}
}
