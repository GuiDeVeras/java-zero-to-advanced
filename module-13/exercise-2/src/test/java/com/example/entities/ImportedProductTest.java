package com.example.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ImportedProductTest {

    private ImportedProduct product;

    @BeforeEach
    void setUp() {
        product = new ImportedProduct("Tv", 40, 40.00);
    }

    	@Test
    	void emptyConstructor() {
		ImportedProduct empty = new ImportedProduct();
	
		assertNull(empty.getName());
		assertEquals(0.0, empty.getPrice());
		assertEquals(0.0, empty.getCustomsFee());
    	}

    	@Test
    	void constructorWithParameters() {
		assertEquals("Tv", product.getName());
		assertEquals(40.0, product.getPrice());
		assertEquals(40.0, product.getCustomsFee());
	}

    	@Test
    	void setCustomsFee() {
		product.setCustomsFee(150.0);
	
		assertEquals(150.0, product.getCustomsFee());
    	}

    	@Test
    	void inheritedSetName() {
		product.setName("Computer");
	
		assertEquals("Computer", product.getName());
    	}

    	@Test
    	void totalPriceCalculation() {
        	assertEquals(80.0, product.totalPrice(), 0.001);
    	}

    	@Test
    	void totalPriceWithZeroCustomsFee() {
		product.setCustomsFee(0.0);
		
		assertEquals(40.0, product.totalPrice(), 0.001); 
   	}
}
