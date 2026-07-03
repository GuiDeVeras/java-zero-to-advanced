package com.example.util;

import java.util.function.Consumer;

import com.example.entities.Product;

public class ProductUpdate implements Consumer<Product> {

	@Override
	public void accept (Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
}
