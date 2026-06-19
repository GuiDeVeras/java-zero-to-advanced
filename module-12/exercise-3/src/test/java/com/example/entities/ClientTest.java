package com.example.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class ClientTest {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	
	@Test
	void emptyConstructor() {
		Client client = new Client();
		
		assertNull(client.getName());
	}

    	@Test
    	void constructorWithParameters() throws ParseException {
        	Date date = sdf.parse("10/05/1999");
        	Client client = new Client("João", "jsilva@gmail.com", date);
        	
        	assertEquals("João", client.getName());
        	assertEquals("jsilva@gmail.com", client.getEmail());
        	assertEquals(date, client.getBirthDate());
    	}	

    	@Test
    	void setName() {
		Client client = new Client();
		
		client.setName("Maria");
		
		assertEquals("Maria", client.getName());
	}
	
	@Test
    	void setEmail() {
		Client client = new Client();
		
		client.setEmail("mspin@gmail.com");
		
		assertEquals("mspin@gmail.com", client.getEmail());
	}
	
	@Test
    	void setBirthDate() throws ParseException {
		Client client = new Client();
		Date date = sdf.parse("31/01/2007");
		
		client.setBirthDate(date);
		
		assertEquals(date, client.getBirthDate());
	}

    	@Test
    	void changeNameAfterCreation() throws ParseException {
		Date date = sdf.parse("10/05/1999");
        	Client client = new Client("João", "jsilva@gmail.com", date);
        	
		client.setName("Maria");
		
		assertEquals("Maria", client.getName());
	}
	
	@Test
    	void changeEmailAfterCreation() throws ParseException {
		Date date = sdf.parse("10/05/1999");
        	Client client = new Client("João", "jsilva@gmail.com", date);
        	
		client.setEmail("mspin@gmail.com");
		
		assertEquals("mspin@gmail.com", client.getEmail());
	}
	
	@Test
    	void changeBirthDateAfterCreation() throws ParseException {
		Date date = sdf.parse("10/05/1999");
		Date newDate = sdf.parse("31/01/2006");
        	Client client = new Client("João", "jsilva@gmail.com", date);
        	
		client.setBirthDate(newDate);
		
		assertEquals(newDate, client.getBirthDate());
	}
}
