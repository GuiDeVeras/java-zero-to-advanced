package com.example.entities;

public class ImportedProduct extends Product {
	
	private double customsFee;
	
	public ImportedProduct () {
		super();
	}
	
	public ImportedProduct (String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double getCustomsFee () {
		return customsFee;
	}
	public void setCustomsFee (double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")\n");
		return sb.toString();
	}
	
	public double totalPrice() {
		return price + customsFee;
	}
}
