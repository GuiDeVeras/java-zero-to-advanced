package com.example.entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {
	
	private Date manufactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct () {
		super();
	}
	
	public UsedProduct (String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManufactureDate () {
		return manufactureDate;
	}
	public void setManufactureDate (Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " (used) $ " + String.format("%.2f", price) + " (Manufacture date: " + sdf.format(manufactureDate) + ")\n");
		return sb.toString();
	}

}
