package com.example.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.model.entities.Product;
import com.example.model.services.ProductService;

public class Main {
	public static void main (String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum (list, p -> p.getName().charAt(0) == 'T');
		
		System.out.printf ("Sum = %.2f%n", sum);
	
	}

}
