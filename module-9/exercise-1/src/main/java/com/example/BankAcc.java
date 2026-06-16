package com.example;

public class BankAcc {
	
	private int accNumber;
	private String accHolder;
	private double balance;
	
	public BankAcc(int accNumber, String accHolder) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
	}
	
	public BankAcc(int accNumber, String accHolder, double balance) {
		this.accNumber = accNumber;
		this.accHolder = accHolder;
		deposit(balance);
	}
	
	public int getAccNumber () {
		return accNumber;
	}
	
	public String getAccHolder () {
		return accHolder;
	}
	public void setAccHolder (String accHolder) {
		this.accHolder = accHolder;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= (amount + 5);
	}
	
	public String accData () {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f%n%n", getAccNumber(), getAccHolder(), getBalance());
	}
}
