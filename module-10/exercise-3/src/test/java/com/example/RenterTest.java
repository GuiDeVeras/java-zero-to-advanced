package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RenterTest {
	
	@Test
	void setName() {
        	Renter student = new Renter();
        	student.setName("Jane");
        	assertEquals("Jane", student.getName());
        }
        
        @Test
	void setEmail() {
        	Renter student = new Renter();
        	student.setEmail("jane101@gmail.com");
        	assertEquals("jane101@gmail.com", student.getEmail());
        }
        
        @Test
	void setRoom() {
        	Renter student = new Renter();
        	student.setRoom(7);
        	assertEquals(7, student.getRoom());
        }
	
}
