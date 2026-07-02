package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.example.entities.Rectangle;
import com.example.entities.Shape;

class RectangleTest {

    	private Rectangle rectangle;

    	@BeforeEach
    	void setUp() {
        rectangle = new Rectangle(21.00, 12.00);
    	}

    	@Test
    	void emptyConstructor() {
		Rectangle empty = new Rectangle();
	
		assertEquals(null, empty.getWidth());
		assertEquals(null, empty.getHeight());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals(21.00, rectangle.getWidth(), 0.001);
		assertEquals(12.00, rectangle.getHeight(), 0.001);
	}

    	@Test
    	void setWidth() {
		rectangle.setWidth(9.00);
	
		assertEquals(9.00, rectangle.getWidth(), 0.001);
    	}
    	
    	@Test
    	void setHeight() {
		rectangle.setHeight(10.00);
	
		assertEquals(10.00, rectangle.getHeight(), 0.001);
    	}
    	
    	@Test
    	void AreaWithNonZero() {
        	assertEquals(252.00, rectangle.area(), 0.001);
    	}

    	@Test
    	void AreaWithZero() {
        	rectangle.setWidth(0.00);
        	
        	assertEquals(0.00, rectangle.area(), 0.001);
    	}
}
