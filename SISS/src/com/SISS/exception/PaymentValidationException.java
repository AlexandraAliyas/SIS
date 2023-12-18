package com.SISS.exception;

public class PaymentValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	public PaymentValidationException(){
		System.out.println("from PaymentValidationException constructor");
	}
	
	public String toString() {
		return "Payment ValidationException";
	}
}
