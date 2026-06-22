package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.example.entities.Individual;
import com.example.entities.TaxPayer;

class IndividualTest {

    private Individual individual;

    @BeforeEach
    void setUp() {
        individual = new Individual ("Bruno", 19000.00, 5000.00);
    }

    	@Test
    	void emptyConstructor() {
		Individual empty = new Individual();
	
		assertNull(empty.getName());
		assertNull(empty.getAnualIncome());
		assertNull(empty.getHealthExpenditures());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals("Bruno", individual.getName());
		assertEquals(19000.00, individual.getAnualIncome());
		assertEquals(5000.00, individual.getHealthExpenditures());
	}

    	@Test
    	void inheritedSetName() {
		individual.setName("João");
		
		assertEquals("João", individual.getName());
    	}
    	
    	@Test
    	void inheritedSetAnualIncome() {
		individual.setAnualIncome(50000.00);
	
		assertEquals(50000.00, individual.getAnualIncome(), 0.001);
    	}
    	

    	@Test
    	void setHealthExpenditures() {
		individual.setHealthExpenditures(2000.00);
	
		assertEquals(2000.00, individual.getHealthExpenditures(), 0.001);
    	}

    	@Test
    	void totalTaxeswithNonZero() {
        	assertEquals(350.00, individual.totalTaxes(), 0.01);
    	}

    	@Test
    	void totalTaxeswithZero() {
        	individual.setHealthExpenditures(0.00);
        	
        	assertEquals(2850.00, individual.totalTaxes(), 0.001);
    	}
    	
    	@Test
    	void totalTaxeswithMoreThan20000() {
        	individual.setAnualIncome(21000.00);
        	
        	assertEquals(2750.00, individual.totalTaxes(), 0.01);
    	}
}
