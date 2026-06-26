package com.example.model.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    	@Test
    	void emptyConstructor() {
		Vehicle vehicle = new Vehicle();
		
		assertNull(vehicle.getModel());
    	}

    	@Test
    	void constructorWithModel() {
		Vehicle vehicle = new Vehicle("Civic");
		
		assertEquals("Civic", vehicle.getModel());
    	}

    	@Test
    	void setModel() {
		Vehicle vehicle = new Vehicle();
		
		vehicle.setModel("Corolla");
		
		assertEquals("Corolla", vehicle.getModel());
    	}
}
