package com.example.model.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CarRentalTest {

    	private CarRental carRental;
    	private Vehicle vehicle;
    	private LocalDateTime start;
    	private LocalDateTime finish;

    	@BeforeEach
    	void setUp() {
		vehicle = new Vehicle("Civic");
		start = LocalDateTime.of(2026, 6, 20, 8, 0);
		finish = LocalDateTime.of(2026, 6, 20, 18, 0);
		carRental = new CarRental(start, finish, vehicle);
    	}

    	@Test
    	void emptyConstructor() {
		CarRental empty = new CarRental();
		
		assertNull(empty.getStart());
		assertNull(empty.getFinish());
		assertNull(empty.getVehicle());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals(start, carRental.getStart());
		assertEquals(finish, carRental.getFinish());
		assertEquals(vehicle, carRental.getVehicle());
    	}

    	@Test
    	void setStart() {
		LocalDateTime newStart = LocalDateTime.of(2026, 6, 21, 9, 0);
		carRental.setStart(newStart);
		
		assertEquals(newStart, carRental.getStart());
    	}

    	@Test
    	void setFinish() {
        	LocalDateTime newFinish = LocalDateTime.of(2026, 6, 21, 19, 0);
        	carRental.setFinish(newFinish);
        	
        	assertEquals(newFinish, carRental.getFinish());
    	}

    	@Test
    	void setVehicle() {
        	Vehicle newVehicle = new Vehicle("Corolla");
        	carRental.setVehicle(newVehicle);
        	
        	assertEquals(newVehicle, carRental.getVehicle());
    	}

    	@Test
    	void setInvoice() {
        	Invoice invoice = new Invoice(100.0, 20.0);
        	carRental.setInvoice(invoice);
        	
        	assertEquals(invoice, carRental.getInvoice());
    	}
}
