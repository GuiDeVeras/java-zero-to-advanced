package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import com.example.entities.Circle;
import com.example.entities.Shape;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(21.00);
    }

    	@Test
    	void emptyConstructor() {
		Circle empty = new Circle();
	
		assertEquals(null, empty.getRadius());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals(21.00, circle.getRadius(), 0.001);
	}

    	@Test
    	void setRadius() {
		circle.setRadius(9.00);
	
		assertEquals(9.00, circle.getRadius(), 0.001);
    	}

    	@Test
    	void AreaWithNonZero() {
        	assertEquals(1385.44, circle.area(), 0.01);
    	}

    	@Test
    	void AreaWithZero() {
        	circle.setRadius(0.00);
        	
        	assertEquals(0.00, circle.area(), 0.001);
    	}
}
