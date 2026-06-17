package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccTest {

    	@Test
	void constructorWithoutBalance() {
        	BankAcc acc = new BankAcc(1001, "John");
        	assertEquals(1001, acc.getAccNumber());
        	assertEquals("John", acc.getAccHolder());
        	assertEquals(0.0, acc.getBalance(), 0.001);
    	}

	@Test
	void constructorWithBalance() {
        	BankAcc acc = new BankAcc(1001, "John", 500.0);
        	assertEquals(500.0, acc.getBalance(), 0.001);
	}

	@Test
	void setAccHolder() {
        	BankAcc acc = new BankAcc(1001, "John");
        	acc.setAccHolder("Jane");
        	assertEquals("Jane", acc.getAccHolder());
	}

	@Test
	void depositIncreasesBalance() {
        	BankAcc acc = new BankAcc(1001, "John");
        	acc.deposit(200.0);
        	assertEquals(200.0, acc.getBalance(), 0.001);
    	}

    	@Test
    	void depositMultipleTimes() {
        	BankAcc acc = new BankAcc(1001, "John");
        	acc.deposit(200.0);
        	acc.deposit(300.0);
        	assertEquals(500.0, acc.getBalance(), 0.001);
    	}


    	@Test
    	void withdrawDecreasesBalanceWithFee() {
        	BankAcc acc = new BankAcc(1001, "John");
        	acc.deposit(200.0);
        	acc.withdraw(100.0);
        	assertEquals(95.0, acc.getBalance(), 0.001);
    	}

    	@Test
    	void withdrawWithInsufficientBalance() {
        	BankAcc acc = new BankAcc(1001, "John");
        	acc.withdraw(50.0);
        	assertEquals(-55.0, acc.getBalance(), 0.001);
    	}

    	@Test
	void accDataFormat() {
    		BankAcc acc = new BankAcc(1001, "John");
    		acc.deposit(500.0);
    		String result = acc.accData();
    		assertEquals("Account 1001, Holder: John, Balance: $ 500,00\n\n", result);
	}
	
}
