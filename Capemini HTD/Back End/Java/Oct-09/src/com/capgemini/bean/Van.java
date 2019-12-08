package com.capgemini.bean;

public class Van { //singleton
private static final Van ref = new Van();

private Van() {
	
}

public static Van getVan() {
	return ref;
}
}
