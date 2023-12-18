package com.SISS.exception;

public class InvalidEnrollmentDataException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidEnrollmentDataException(){
		System.out.println("from InvalidEnrollmentDataException constructor");
	}
	
	public String toString() {
		return "Invalid Enrollment DataException";
	}
}

