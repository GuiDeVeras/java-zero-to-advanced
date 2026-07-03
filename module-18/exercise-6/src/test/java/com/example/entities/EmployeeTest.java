package com.example.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
	
	@Test
	void emptyConstructor() {
		Employee employee = new Employee();
		
		assertNull(employee.getName());
	}

    	@Test
    	void constructorWithParameters() {
        	Employee employee = new Employee("João", "jsilva@gmail.com", 2000);
        	
        	assertEquals("João", employee.getName());
        	assertEquals("jsilva@gmail.com", employee.getEmail());
        	assertEquals(2000, employee.getSalary());
    	}	

    	@Test
    	void setName() {
		Employee employee = new Employee();
		
		employee.setName("Maria");
		
		assertEquals("Maria", employee.getName());
	}
	
	@Test
    	void setEmail() {
		Employee employee = new Employee();
		
		employee.setEmail("mspin@gmail.com");
		
		assertEquals("mspin@gmail.com", employee.getEmail());
	}
	
	@Test
    	void setSalary() {
		Employee employee = new Employee();
		
		employee.setSalary(1000);
		
		assertEquals(1000, employee.getSalary());
	}

    	@Test
    	void changeNameAfterCreation() {
        	Employee employee = new Employee("João", "jsilva@gmail.com", 1000);
        	
		employee.setName("Maria");
		
		assertEquals("Maria", employee.getName());
	}
	
	@Test
    	void changeEmailAfterCreation() {
        	Employee employee = new Employee("João", "jsilva@gmail.com", 1000);
        	
		employee.setEmail("mspin@gmail.com");
		
		assertEquals("mspin@gmail.com", employee.getEmail());
	}
	
	@Test
    	void changeSalaryAfterCreation() {
		Date newDate = sdf.parse("31/01/2006");
        	Employee employee = new Employee("João", "jsilva@gmail.com", 1000);
        	
		employee.setSalary(newDate);
		
		assertEquals(newDate, employee.getSalary());
	}
}
