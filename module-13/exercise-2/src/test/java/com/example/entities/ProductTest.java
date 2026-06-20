package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    	private Product product;

	@BeforeEach
	void setUp() {
		product = new Product("TV", 40);
	}

    	@Test
    	void emptyConstructor() {
		Product empty = new Product();
		
		assertNull(empty.getName());
		assertEquals(0.0, empty.getPrice());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals("TV", product.getName());
		assertEquals(40.0, product.getPrice());
    	}

    	@Test
    	void setName() {
		product.setName("PC");
		
		assertEquals("PC", product.getName());
    	}

    	@Test
    	void setPrice() {
		product.setPrice(30.0);
	
		assertEquals(30.0, product.getPrice());
    	}
}
