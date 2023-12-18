package com.SISS.exception;

public class TeacherNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public TeacherNotFoundException(){
		System.out.println("from TeacherNotFoundException constructor");
	}
	
	public String toString() {
		return " Teacher Not Found Exception";
	}
}
