package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
	
	@Test
	void setNameTest() {
        	Worker employee = new Worker(5, "Miguel", 10);
        	employee.setName("Jane");
        	assertEquals("Jane", employee.getName());
        }
        
        @Test
	void setIdTest() {
        	Worker employee = new Worker(5, "Miguel", 10);
        	employee.setId(7);
        	assertEquals(7, employee.getId());
        }

	@Test
	void increaseSalaryTest() {
		Worker employee = new Worker(5, "Miguel", 10);
		employee.increaseSalary(100);
		assertEquals(20, employee.getSalary());
	}
	
}
