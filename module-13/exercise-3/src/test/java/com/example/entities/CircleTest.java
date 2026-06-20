package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.example.entities.Circle;
import com.example.entities.Shape;
import com.example.entities.enums.Color;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(Color.valueOf("BLACK"), 21.00);
    }

    	@Test
    	void emptyConstructor() {
		Circle empty = new Circle();
	
		assertNull(empty.getColor());
		assertEquals(null, empty.getRadius());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals(Color.valueOf("BLACK"), circle.getColor());
		assertEquals(21.00, circle.getRadius(), 0.001);
	}

    	@Test
    	void setRadius() {
		circle.setRadius(9.00);
	
		assertEquals(9.00, circle.getRadius(), 0.001);
    	}
    	

    	@Test
    	void inheritedSetColor() {
		circle.setColor(Color.valueOf("BLUE"));
	
		assertEquals(Color.valueOf("BLUE"), circle.getColor());
    	}

    	@Test
    	void AreaWithNonZero() {
        	assertEquals(1385.40, circle.area(), 0.01);
    	}

    	@Test
    	void AreaWithZero() {
        	circle.setRadius(0.00);
        	
        	assertEquals(0.00, circle.area(), 0.001);
    	}
}
