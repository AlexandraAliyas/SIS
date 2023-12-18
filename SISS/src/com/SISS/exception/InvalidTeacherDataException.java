package com.SISS.exception;

public class InvalidTeacherDataException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidTeacherDataException(){
		System.out.println("from InvalidTeacherDataException constructor");
	}
	
	public String toString() {
		return "Invalid Teacher Data Exception";
	}
}
