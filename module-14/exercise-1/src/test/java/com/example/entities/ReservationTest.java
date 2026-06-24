package com.example.model.entities;

import com.example.model.exceptions.DomainException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

	private SimpleDateFormat sdf;
	private Date checkIn;
	private Date checkOut;
	private Reservation reservation;

	@BeforeEach
	void setUp() throws ParseException {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		checkIn = sdf.parse("20/06/2026");
		checkOut = sdf.parse("23/06/2026");
		reservation = new Reservation(101, checkIn, checkOut);
    	}

    	@Test
    	void emptyConstructor() {
		Reservation empty = new Reservation();
		assertNull(empty.getRoomNumber());
		assertNull(empty.getCheckIn());
		assertNull(empty.getCheckOut());
    	}

    	@Test
    	void constructorWithValidDates() {
		assertEquals(101, reservation.getRoomNumber());
		assertEquals(checkIn, reservation.getCheckIn());
		assertEquals(checkOut, reservation.getCheckOut());
    	}

    	@Test
    	void constructorWithInvalidDatesThrowsException() throws ParseException {
		Date invalidCheckIn = sdf.parse("25/06/2026");
		Date invalidCheckOut = sdf.parse("20/06/2026");

		assertThrows(DomainException.class, () -> {
		    new Reservation(101, invalidCheckIn, invalidCheckOut);
		});
    	}

    	@Test
    	void setRoomNumber() {
		reservation.setRoomNumber(202);
		assertEquals(202, reservation.getRoomNumber());
    	}

    	@Test
    	void durationCalculation() {
        	assertEquals(3, reservation.duration()); 
    	}

    	@Test
    	void updateDatesWithValidFutureDates() throws ParseException {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		Date newCheckIn = calendar.getTime();

		calendar.add(Calendar.DAY_OF_MONTH, 2);
		Date newCheckOut = calendar.getTime();

		reservation.updateDates(newCheckIn, newCheckOut);
		assertEquals(newCheckIn, reservation.getCheckIn());
		assertEquals(newCheckOut, reservation.getCheckOut());
    	}

    	@Test
    	void updateDatesWithPastCheckInThrowsException() throws ParseException {
		Date pastCheckIn = sdf.parse("01/01/2020");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 5);
		Date futureCheckOut = calendar.getTime();

		assertThrows(DomainException.class, () -> {
		    reservation.updateDates(pastCheckIn, futureCheckOut);
        	});
    	}

    	@Test
    	void updateDatesWithCheckOutBeforeCheckInThrowsException() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 10);
		Date futureCheckIn = calendar.getTime();

		calendar.add(Calendar.DAY_OF_MONTH, -5);
		Date earlierCheckOut = calendar.getTime();

		assertThrows(DomainException.class, () -> {
		    reservation.updateDates(futureCheckIn, earlierCheckOut);
		});
    	}

    	@Test
    	void toStringFormat() {
		String expected = "Room 101, check-in: 20/06/2026, check-out: 23/06/2026, 3 nights\n";
		assertEquals(expected, reservation.toString());
    	}
}
