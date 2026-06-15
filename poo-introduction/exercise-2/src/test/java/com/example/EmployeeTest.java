package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

	private final Employee x = new Employee ();

	@Test
	void PositiveInt() {
		x.grossSalary = 6000.00;
		x.tax = 1000.00;
        
        	assertEquals(x.netSalary(), 5000, 0.001);
        	assertEquals(x.increaseSalary(10), 5600, 0.001);
    	}

	@Test
	void ZeroTax() {
		x.grossSalary = 6000.00;
		x.tax = 0.00;

        	assertEquals(x.netSalary(), 6000, 0.001);
        	assertEquals(x.increaseSalary(10), 6600, 0.001);
	}

	@Test
	void ZeroSalary() {
		x.grossSalary = 0.00;
		x.tax = 1000.00;

        	assertEquals(x.netSalary(), -1000, 0.001);
        	assertEquals(x.increaseSalary(10), -1000, 0.001);
	}

	@Test
	void ZeroPercentage() {
		x.grossSalary = 6000.00;
		x.tax = 1000.00;
        
        	assertEquals(x.netSalary(), 5000, 0.001);
        	assertEquals(x.increaseSalary(0), 5000, 0.001);
    	}
}
