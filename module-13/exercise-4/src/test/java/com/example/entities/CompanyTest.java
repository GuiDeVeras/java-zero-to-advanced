package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.example.entities.Company;
import com.example.entities.TaxPayer;

class CompanyTest {

    private Company company;

    @BeforeEach
    void setUp() {
        company = new Company ("BakeryInc", 300000.00, 30);
    }

    	@Test
    	void emptyConstructor() {
		Company empty = new Company();
	
		assertNull(empty.getName());
		assertNull(empty.getAnualIncome());
		assertNull(empty.getNumberEmployees());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals("BakeryInc", company.getName());
		assertEquals(300000.00, company.getAnualIncome());
		assertEquals(30, company.getNumberEmployees());
	}

    	@Test
    	void inheritedSetName() {
		company.setName("SleepEnterprise");
		
		assertEquals("SleepEnterprise", company.getName());
    	}
    	
    	@Test
    	void inheritedSetAnualIncome() {
		company.setAnualIncome(600000.00);
	
		assertEquals(600000.00, company.getAnualIncome(), 0.001);
    	}
    	

    	@Test
    	void setNumberEmployees() {
		company.setNumberEmployees(5);
	
		assertEquals(5, company.getNumberEmployees());
    	}

    	@Test
    	void totalTaxeswithNonZero() {
        	assertEquals(42000.00, company.totalTaxes(), 0.01);
    	}

    	@Test
    	void totalTaxeswithZero() {
        	company.setAnualIncome(0.00);
        	
        	assertEquals(0, company.totalTaxes(), 0.001);
    	}
    	
    	@Test
    	void totalTaxeswithLessThan10Employees() {
        	company.setNumberEmployees(9);
        	
        	assertEquals(48000, company.totalTaxes(), 0.01);
    	}
}
