package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    	private Employee employee;

	@BeforeEach
	void setUp() {
		employee = new Employee("Maria", 40, 25.0);
	}

    	@Test
    	void emptyConstructor() {
		Employee empty = new Employee();
		
		assertNull(empty.getName());
		assertEquals(0, empty.getHours());
		assertEquals(0.0, empty.getValuePerHour());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals("Maria", employee.getName());
		assertEquals(40, employee.getHours());
		assertEquals(25.0, employee.getValuePerHour());
    	}

    	@Test
    	void setName() {
		employee.setName("João");
		
		assertEquals("João", employee.getName());
    	}

    	@Test
    	void setHours() {
		employee.setHours(50);
	
		assertEquals(50, employee.getHours());
    	}

    	@Test
    	void setValuePerHour() {
		employee.setValuePerHour(30.0);
	
		assertEquals(30.0, employee.getValuePerHour());
    	}

    	@Test
    	void paymentCalculation() {
        assertEquals(1000.0, employee.payment(), 0.001);
   	}

    	@Test
    	void paymentWithZeroHours() {
		employee.setHours(0);
		
		assertEquals(0.0, employee.payment(), 0.001);
    	}

	@Test
    	void paymentWithDecimalRate() {
		employee.setValuePerHour(33.33);
		employee.setHours(3);
		
		assertEquals(99.99, employee.payment(), 0.001);
    	}
}
