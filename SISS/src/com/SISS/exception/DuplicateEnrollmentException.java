package com.SISS.exception;

public class DuplicateEnrollmentException extends Exception {

	private static final long serialVersionUID = 1L;

	public DuplicateEnrollmentException(){
		System.out.println("from DuplicateEnrollmentException constructor");
	}
	
	public String toString() {
		return "Duplicate Enrollment Exception";
	}
}
