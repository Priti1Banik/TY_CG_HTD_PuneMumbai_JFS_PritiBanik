package com.capgemini.corejava.exceptionhandling;

public class InvalidAgeException extends RuntimeException{

	private String message="Invalid age to proceed";
	
	public String getMessage() {
		return message;
	}
	//@Override
	//public String toString() {
	//return message;
	//}
}
