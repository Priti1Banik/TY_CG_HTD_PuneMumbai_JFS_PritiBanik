package com.capgemini.corejava.exceptionhandling;

public class Amount {
void check(int val) throws InvalidLimitException {  //throws is mandatory in case of custom exception
	if(val>40000) {
		throw new InvalidLimitException();
	}
}
}
