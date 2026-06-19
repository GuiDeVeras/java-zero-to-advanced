package com.example.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.example.entities.Client;
import com.example.entities.Client;
import com.example.entities.Order;
import com.example.entities.enums.OrderStatus;
import java.text.ParseException;

class OrderTest {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	@Test
	void emptyConstructor() {
		Order order = new Order();
		assertNull(order.getClient());
	}

    	@Test
    	void constructorWithParameters() throws ParseException {
        	Date date = sdf.parse("10/05/1999");
        	Date dateNow = new Date();
        	Client client = new Client ("João", "jsilva@gmail.com", date);
        	Order order = new Order (dateNow, OrderStatus.valueOf("SHIPPED"), client);
        	
        	assertEquals(dateNow, order.getMoment());
        	assertEquals(OrderStatus.valueOf("SHIPPED"), order.getStatus());
        	assertEquals(client, order.getClient());
    	}	

    	@Test
    	void setMoment() {
		Date date = new Date();
		Order order = new Order();
		
		order.setMoment(date);
		
		assertEquals(date, order.getMoment());
	}
	
	@Test
    	void setStatus() {
		Order order = new Order();
		
		order.setStatus(OrderStatus.valueOf("PENDING_PAYMENT"));
		
		assertEquals(OrderStatus.valueOf("PENDING_PAYMENT"), order.getStatus());
	}
	
	@Test
    	void setClient() throws ParseException {
		Date date = sdf.parse("10/05/1999");		
		Client client = new Client ("João", "jsilva@gmail.com", date);
		Order order = new Order();
		
		order.setClient(client);
		
		assertEquals(client, order.getClient());
	}

    	@Test
    	void addItem() throws ParseException {
		Date date = sdf.parse("10/05/1999");
        	Date dateNow = new Date();
        	Client client = new Client ("João", "jsilva@gmail.com", date);
        	Order order = new Order (dateNow, OrderStatus.valueOf("SHIPPED"), client);
		Product product = new Product("Mouse", 50.0);
		OrderItem item = new OrderItem(2, 50.0, product);
		
		order.addItem(item);
		
		assertEquals(1, order.getItems().size());
    	}

    	@Test
    	void removeItem() throws ParseException {
		Date date = sdf.parse("10/05/1999");
        	Date dateNow = new Date();
        	Client client = new Client ("João", "jsilva@gmail.com", date);
        	Order order = new Order (dateNow, OrderStatus.valueOf("SHIPPED"), client);
		Product product = new Product("Mouse", 50.0);
		OrderItem item = new OrderItem(2, 50.0, product);
		
		order.addItem(item);
		order.removeItem(item);
		
		assertEquals(0, order.getItems().size());
    	}

    	@Test
    	void totalWithoutItems() throws ParseException {
        	Date date = sdf.parse("10/05/1999");
        	Date dateNow = new Date();
        	Client client = new Client ("João", "jsilva@gmail.com", date);
        	Order order = new Order (dateNow, OrderStatus.valueOf("SHIPPED"), client);
    		
        	assertEquals(0.0, order.total(), 0.001);
    	}

    	@Test
    	void totalWithOneItem() throws ParseException {
		Date date = sdf.parse("10/05/1999");
        	Date dateNow = new Date();
        	Client client = new Client ("João", "jsilva@gmail.com", date);
        	Order order = new Order (dateNow, OrderStatus.valueOf("SHIPPED"), client);
		Product product = new Product("Mouse", 50.0);
		
		order.addItem(new OrderItem(2, 50.0, product));
		
		assertEquals(100.0, order.total(), 0.001);
    	}

    	@Test
    	void totalWithMultipleItems() throws ParseException {
		Date date = sdf.parse("10/05/1999");
        	Date dateNow = new Date();
        	Client client = new Client ("João", "jsilva@gmail.com", date);
        	Order order = new Order (dateNow, OrderStatus.valueOf("SHIPPED"), client);
		Product mouse = new Product("Mouse", 50.0);
		Product keyboard = new Product("Keyboard", 150.0);
		
		order.addItem(new OrderItem(2, 50.0, mouse));  
		order.addItem(new OrderItem(1, 150.0, keyboard));
		
		assertEquals(250.0, order.total(), 0.001);
	}
}
