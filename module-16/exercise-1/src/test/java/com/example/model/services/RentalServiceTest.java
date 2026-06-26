package com.example.model.services;

import com.example.model.entities.CarRental;
import com.example.model.entities.Vehicle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class RentalServiceTest {

    	private RentalService rentalService;
    	private TaxService taxService;

    	@BeforeEach
    	void setUp() {
		taxService = new BrazilTaxService();
		rentalService = new RentalService(10.0, 100.0, taxService);
    	}

    	@Test
    	void processInvoiceWithHoursUpTo12() {
		LocalDateTime start = LocalDateTime.of(2026, 6, 20, 8, 0);
		LocalDateTime finish = LocalDateTime.of(2026, 6, 20, 13, 0);
		CarRental rental = new CarRental(start, finish, new Vehicle("Civic"));

		rentalService.processInvoice(rental);

		assertEquals(50.0, rental.getInvoice().getBasicPayment(), 0.001);
		assertEquals(10.0, rental.getInvoice().getTax(), 0.001);
    	}

    	@Test
    	void processInvoiceWithHoursAbove12() {
		LocalDateTime start = LocalDateTime.of(2026, 6, 20, 8, 0);
		LocalDateTime finish = LocalDateTime.of(2026, 6, 21, 14, 0); 
		CarRental rental = new CarRental(start, finish, new Vehicle("Civic"));

		rentalService.processInvoice(rental);

		assertEquals(200.0, rental.getInvoice().getBasicPayment(), 0.001);
		assertEquals(30.0, rental.getInvoice().getTax(), 0.001);
    	}

    	@Test
    	void processInvoiceWithPartialHourRoundsUp() {
		LocalDateTime start = LocalDateTime.of(2026, 6, 20, 8, 0);
		LocalDateTime finish = LocalDateTime.of(2026, 6, 20, 9, 30); 
		CarRental rental = new CarRental(start, finish, new Vehicle("Civic"));

		rentalService.processInvoice(rental);

		assertEquals(20.0, rental.getInvoice().getBasicPayment(), 0.001);
    	}
}
