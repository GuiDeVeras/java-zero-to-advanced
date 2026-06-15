package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

	private final Student x = new Student ();

	@Test
	void Passed() {
		x.grade1 = 32.00;
		x.grade2 = 31.00;
        	x.grade3 = 33.00;
        
        	assertEquals(x.finalGrade(), 96.00);
    	}

	@Test
	void Failed() {
		x.grade1 = 18.00;
		x.grade2 = 10.00;
        	x.grade3 = 25.00;
        
        	assertEquals(x.finalGrade(), 53.00);
	}
}
