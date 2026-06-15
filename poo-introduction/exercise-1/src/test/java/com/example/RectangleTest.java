package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    	@Test
	void twoIntPositives() {
		Rectangle x;
		x = new Rectangle();
		
		x.width = 2;
		x.height = 3;

		assertEquals(6, x.area());
		assertEquals(10, x.perimeter());
		assertEquals(Math.sqrt(13), x.diagonal(), 0.001);
    	}

	@Test
	void twoDecimalsPositive() {
		Rectangle x;
		x = new Rectangle();
		
		x.width = 2.10;
		x.height = 3.5;

		assertEquals(7.35, x.area(), 0.001);
		assertEquals(11.20, x.perimeter(), 0.001);
		assertEquals(Math.sqrt(16.66), x.diagonal(), 0.001);
     	}
}	
