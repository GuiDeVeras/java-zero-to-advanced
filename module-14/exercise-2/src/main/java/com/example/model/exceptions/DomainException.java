package com.example.model.exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainException (String msg) {
		super(msg);
	}
}
