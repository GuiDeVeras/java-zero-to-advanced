package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class OutsourcedEmployeeTest {

    private OutsourcedEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new OutsourcedEmployee("Maria", 40, 25.0, 100.0);
    }

    	@Test
    	void emptyConstructor() {
		OutsourcedEmployee empty = new OutsourcedEmployee();
	
		assertNull(empty.getName());
		assertEquals(0, empty.getHours());
		assertEquals(0.0, empty.getValuePerHour());
		assertEquals(0.0, empty.getAdditionalCharge());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals("Maria", employee.getName());
		assertEquals(40, employee.getHours());
		assertEquals(25.0, employee.getValuePerHour());
		assertEquals(100.0, employee.getAdditionalCharge());
	}

    	@Test
    	void setAdditionalCharge() {
		employee.setAdditionalCharge(150.0);
	
		assertEquals(150.0, employee.getAdditionalCharge());
    	}

    	@Test
    	void inheritedSetName() {
		employee.setName("João");
	
		assertEquals("João", employee.getName());
    	}

    	@Test
    	void paymentCalculation() {
        	assertEquals(1110.0, employee.payment(), 0.001);
    }

    	@Test
    	void paymentWithZeroAdditionalCharge() {
		employee.setAdditionalCharge(0.0);
		
		assertEquals(1000.0, employee.payment(), 0.001); 
    }

    	@Test
    	void paymentOverridesParentBehavior() {
		Employee asEmployee = employee;
		 
		assertEquals(1110.0, asEmployee.payment(), 0.001);
    }
}
