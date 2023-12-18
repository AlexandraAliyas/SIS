package com.SISS.exception;

public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(){
		System.out.println("from InsufficientFundsException constructor");
	}
	
	public String toString() {
		return " Insufficient Funds Exception";
	}
}
