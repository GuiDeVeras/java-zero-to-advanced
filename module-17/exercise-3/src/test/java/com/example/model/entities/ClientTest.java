package com.example.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ClientTest {
	
	@Test
	void emptyConstructor() {
		Client client = new Client();
		
		assertNull(client.getName());
	}

    	@Test
    	void constructorWithParameters()  {
        	Client client = new Client("João", "jsilva@gmail.com");
        	
        	assertEquals("João", client.getName());
        	assertEquals("jsilva@gmail.com", client.getEmail());
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
    	void changeNameAfterCreation()  {
        	Client client = new Client("João", "jsilva@gmail.com");
        	
		client.setName("Maria");
		
		assertEquals("Maria", client.getName());
	}
	
	@Test
    	void changeEmailAfterCreation()  {
        	Client client = new Client("João", "jsilva@gmail.com");
        	
		client.setEmail("mspin@gmail.com");
		
		assertEquals("mspin@gmail.com", client.getEmail());
	}
	
}
