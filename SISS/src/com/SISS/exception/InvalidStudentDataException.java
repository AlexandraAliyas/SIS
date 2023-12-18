package com.SISS.exception;

public class InvalidStudentDataException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidStudentDataException(){
		System.out.println("from InvalidStudentDataException constructor");
	}
	
	public String toString() {
		return "Invalid Student Data Exception";
	}
}
