package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.example.entities.Rectangle;
import com.example.entities.Shape;
import com.example.entities.enums.Color;

class RectangleTest {

    	private Rectangle rectangle;

    	@BeforeEach
    	void setUp() {
        rectangle = new Rectangle(Color.valueOf("BLACK"), 21.00, 12.00);
    	}

    	@Test
    	void emptyConstructor() {
		Rectangle empty = new Rectangle();
	
		assertNull(empty.getColor());
		assertEquals(null, empty.getWidth());
		assertEquals(null, empty.getHeight());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals(Color.valueOf("BLACK"), rectangle.getColor());
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
    	void inheritedSetColor() {
		rectangle.setColor(Color.valueOf("BLUE"));
	
		assertEquals(Color.valueOf("BLUE"), rectangle.getColor());
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
