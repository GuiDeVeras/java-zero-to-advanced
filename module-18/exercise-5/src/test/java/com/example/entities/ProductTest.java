package com.example.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

	@Test
	void emptyConstructor() {
		Product product = new Product();
		assertNull(product.getName());
	}

    	@Test
    	void constructorWithParameters() {
        	Product product = new Product("TV", 199.99);
        	assertEquals("TV", product.getName());
        	assertEquals(199.99, product.getPrice(), 0.001);
    	}	

    	@Test
    	void setName() {
		Product product = new Product();
		product.setName("Freezer");
		assertEquals("Freezer", product.getName());
	}
	
	@Test
    	void setPrice() {
		Product product = new Product();
		product.setPrice(999.99);
		assertEquals(999.99, product.getPrice(), 0.001);
	}

    	@Test
    	void changeNameAfterCreation() {
		Product product = new Product("Fan", 123);
		product.setName("Computer");
		assertEquals("Computer", product.getName());
	}
	
	@Test
    	void changePriceAfterCreation() {
		Product product = new Product("Fan", 123);
		product.setPrice(100.00);
		assertEquals(100.00, product.getPrice(), 0.001);
	}
}
