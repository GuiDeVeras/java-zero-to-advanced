package com.example.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.example.entities.Product;

class OrderItemTest {

	@Test
	void emptyConstructor() {
		OrderItem orderItem = new OrderItem();
		
		assertEquals(0.0, orderItem.getPrice());
	}

    	@Test
    	void constructorWithParameters() {
        	Product product = new Product ("Cellphone", 120.00);
        	
        	OrderItem orderItem = new OrderItem(9, 120.00, product);
        	
        	assertEquals(9, orderItem.getQuantity());
        	assertEquals(120.00, orderItem.getPrice());
        	assertEquals(product, orderItem.getProduct());
    	}	

    	@Test
    	void setQuantity() {
		OrderItem orderItem = new OrderItem();
		orderItem.setQuantity(10);
		
		assertEquals(10, orderItem.getQuantity());
	}
	
	@Test
    	void setPrice() {
		OrderItem orderItem = new OrderItem();
		orderItem.setPrice(999.99);
		
		assertEquals(999.99, orderItem.getPrice());
	}
	
	@Test
    	void setProduct() {
		Product product = new Product ("Cellphone", 120.00);
		
		OrderItem orderItem = new OrderItem();
		orderItem.setProduct(product);
		
		assertEquals(product, orderItem.getProduct());
	}

    	@Test
    	void changeQuantitytAfterCreation() {
		Product product = new Product ("Cellphone", 120.00);
        	
        	OrderItem orderItem = new OrderItem(9, 120.00, product);
		orderItem.setQuantity(20);
		
		assertEquals(20, orderItem.getQuantity());
        	assertEquals(120.00, orderItem.getPrice());
        	assertEquals(product, orderItem.getProduct());
	}
	
	@Test
    	void changePriceAfterCreation() {
		Product product = new Product ("Cellphone", 120.00);
        	
        	OrderItem orderItem = new OrderItem(9, 120.00, product);
		orderItem.setPrice(10);
		
		assertEquals(9, orderItem.getQuantity());
        	assertEquals(10, orderItem.getPrice(), 0.001);
        	assertEquals(product, orderItem.getProduct());
	}
	
	@Test
    	void changeProductAfterCreation() {
		Product product = new Product ("Cellphone", 120.00);
        	Product product2 = new Product ("Monitor", 190.99);
        	
        	OrderItem orderItem = new OrderItem(9, 120.00, product);
		orderItem.setProduct(product2);
		
		assertEquals(9, orderItem.getQuantity());
        	assertEquals(120.00, orderItem.getPrice());
        	assertEquals(product2, orderItem.getProduct());
	}
	
	@Test
	void subTotalWithNonZero() {
		Product product = new Product ("Cellphone", 120.00);
		
		OrderItem orderItem = new OrderItem(9, 120.00, product);
		
		assertEquals(1080.00, orderItem.subTotal(), 0.001);
	}
	
	@Test
	void subTotalWithQuantityZero() {
		Product product = new Product ("Cellphone", 120.00);
		
		OrderItem orderItem = new OrderItem(0, 120.00, product);
		
		assertEquals(0.00, orderItem.subTotal(), 0.001);
	}
}
