package com.SISS.exception;

public class CourseNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public CourseNotFoundException(){
		System.out.println("from course not found constructor");
	}
	
	public String toString() {
		return "course not found Exception";
	}
}

