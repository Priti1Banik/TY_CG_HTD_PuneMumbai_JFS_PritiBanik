package com.capgemini.corejava.exceptionhandling;

public class InvalidLimitException extends Exception {

	private String message="Invalid limit";
	public String getMessage() {
	
	return message;
}
}