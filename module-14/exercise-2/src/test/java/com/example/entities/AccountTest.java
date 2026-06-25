package com.example.model.entities;

import com.example.model.exceptions.DomainException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    	private Account account;

    	@BeforeEach
    	void setUp() {
        	account = new Account(1001, "Maria", 1000.0, 500.0);
    	}

    	@Test
    	void emptyConstructor() {
		Account empty = new Account();
		
		assertNull(empty.getNumber());
		assertNull(empty.getHolder());
		assertNull(empty.getBalance());
		assertNull(empty.getWithdrawLimit());
    	}
	
    	@Test
    	void constructorWithParameters() {
		assertEquals(1001, account.getNumber());
		assertEquals("Maria", account.getHolder());
		assertEquals(1000.0, account.getBalance());
		assertEquals(500.0, account.getWithdrawLimit());
    	}

    	@Test
    	void setNumber() {
		account.setNumber(2002);
		
		assertEquals(2002, account.getNumber());
    	}

    	@Test
    	void setHolder() {
        	account.setHolder("João");
        
        	assertEquals("João", account.getHolder());
    	}

    	@Test
    	void setWithdrawLimit() {
        	account.setWithdrawLimit(800.0);
        	
        	assertEquals(800.0, account.getWithdrawLimit());
    	}

    	@Test
    	void depositIncreasesBalance() {
        	account.deposit(200.0);
        
        	assertEquals(1200.0, account.getBalance(), 0.001);
    	}

    	@Test
    	void withdrawDecreasesBalance() {
        	account.withdraw(300.0);
        	
        	assertEquals(700.0, account.getBalance(), 0.001);
    	}

    	@Test
    	void withdrawExceedingLimitThrowsException() {
        	assertThrows(DomainException.class, () -> {
            		account.withdraw(600.0); 
        	});
    	}

    	@Test
    	void withdrawExceedingBalanceThrowsException() {
        	Account lowBalance = new Account(1002, "João", 100.0, 500.0);
        	assertThrows(DomainException.class, () -> {
            		lowBalance.withdraw(150.0);
        	});
    	}

    	@Test
    	void withdrawExactBalanceSucceeds() {
        	account.withdraw(500.0); 
        	
        	assertEquals(500.0, account.getBalance(), 0.001);
    	}
}
