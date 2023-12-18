package com.SISS.exception;

public class InvalidCourseDataException extends Exception {
	 
	private static final long serialVersionUID = 1L;
	public InvalidCourseDataException() {
	        System.out.println("from Invalid Course Data Exception constructor");
	    }
	    public String toString() {
	    	return "Invalid Course Data";
	    }
}
