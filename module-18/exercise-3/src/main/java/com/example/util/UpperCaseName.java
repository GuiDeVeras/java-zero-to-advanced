package com.example.util;

import java.util.function.Function;

import com.example.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply (Product p) {
		return p.getName().toUpperCase();
	}
	
}
