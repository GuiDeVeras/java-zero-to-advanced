package com.example.model.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class LogEntryTest {

    	@Test
    	void shouldCreateObjectUsingEmptyConstructor() {
        	LogEntry log = new LogEntry();

        	assertNull(log.getUsername());
        	assertNull(log.getMoment());
    	}

    	@Test
    	void shouldCreateObjectUsingParameterizedConstructor() {
        	Date date = new Date();

        	LogEntry log = new LogEntry("Maria", date);

        	assertEquals("Maria", log.getUsername());
        	assertEquals(date, log.getMoment());
    	}

    	@Test
    	void shouldSetUsername() {
		LogEntry log = new LogEntry();

		log.setUsername("João");

		assertEquals("João", log.getUsername());
    	}

    	@Test
    	void shouldSetMoment() {
		LogEntry log = new LogEntry();
		Date date = new Date();

		log.setMoment(date);

		assertEquals(date, log.getMoment());
    	}

    	@Test
    	void shouldBeEqualWhenUsernamesAreTheSame() {
		Date d1 = new Date();
		Date d2 = new Date(System.currentTimeMillis() + 1000);

		LogEntry log1 = new LogEntry("Carlos", d1);
		LogEntry log2 = new LogEntry("Carlos", d2);

		assertEquals(log1, log2);
    	}

    	@Test
    	void shouldNotBeEqualWhenUsernamesAreDifferent() {
		LogEntry log1 = new LogEntry("Carlos", new Date());
		LogEntry log2 = new LogEntry("Maria", new Date());

		assertNotEquals(log1, log2);
    	}

    	@Test
    	void shouldHaveSameHashCodeWhenUsernamesAreTheSame() {
		LogEntry log1 = new LogEntry("Carlos", new Date());
		LogEntry log2 = new LogEntry("Carlos", new Date());

		assertEquals(log1.hashCode(), log2.hashCode());
    	}

    	@Test
    	void shouldNotBeEqualToNull() {
		LogEntry log = new LogEntry("Carlos", new Date());

		assertNotEquals(log, null);
    	}

    	@Test
    	void shouldNotBeEqualToDifferentClass() {
		LogEntry log = new LogEntry("Carlos", new Date());

		assertNotEquals(log, "Carlos");
    	}

    	@Test
    	void shouldBeEqualToItself() {
		LogEntry log = new LogEntry("Carlos", new Date());

		assertEquals(log, log);
    	}

    	@Test
    	void shouldHandleNullUsernameInEquals() {
		LogEntry log1 = new LogEntry(null, new Date());
		LogEntry log2 = new LogEntry(null, new Date());

		assertEquals(log1, log2);
		assertEquals(log1.hashCode(), log2.hashCode());
    	}

    	@Test
    	void shouldNotBeEqualWhenOneUsernameIsNull() {
		LogEntry log1 = new LogEntry(null, new Date());
		LogEntry log2 = new LogEntry("Carlos", new Date());

		assertNotEquals(log1, log2);
    	}
}
