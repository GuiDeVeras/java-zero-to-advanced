package com.example.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

	@Test
	void emptyConstructor() {
		Department department = new Department();
		assertNull(department.getName());
	}

    	@Test
    	void constructorWithName() {
        	Department department = new Department("IT");
        	assertEquals("IT", department.getName());
    	}	

    	@Test
    	void setName() {
		Department department = new Department();
		department.setName("Sales");
		assertEquals("Sales", department.getName());
	}

    	@Test
    	void changeNameAfterCreation() {
		Department department = new Department("HR");
		department.setName("Finance");
		assertEquals("Finance", department.getName());
	}
}
