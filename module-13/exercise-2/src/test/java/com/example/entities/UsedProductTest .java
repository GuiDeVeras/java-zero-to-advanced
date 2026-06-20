package com.example.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


class UsedProductTest {

    	private UsedProduct product;
    	private static SimpleDateFormat sdf;
	private Date manufactureDate;

    	@BeforeEach
    	void setUp() throws ParseException{
        	sdf = new SimpleDateFormat("dd/MM/yyyy");
        	manufactureDate = sdf.parse("15/02/2021");
        	product = new UsedProduct("TV", 40, manufactureDate);
    	}

    	@Test
    	void emptyConstructor() {
		UsedProduct empty = new UsedProduct();
	
		assertNull(empty.getName());
		assertEquals(0.0, empty.getPrice());
		assertNull(empty.getManufactureDate());
    	}

    	@Test
    	void constructorWithParameters() throws ParseException {
		assertEquals("TV", product.getName());
		assertEquals(40, product.getPrice());
		assertEquals(manufactureDate, product.getManufactureDate());
	}

    	@Test
    	void setDate() throws ParseException {
		Date newDate = sdf.parse("06/10/2025");
		product.setManufactureDate(newDate);
	
		assertEquals(newDate, product.getManufactureDate());
    	}

    	@Test
    	void inheritedSetName() {
		product.setName("Mouse");
	
		assertEquals("Mouse", product.getName());
    	}
}
