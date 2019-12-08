package com.capg.corejava.basics;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)) {// try resource help us to close the scanner class automatically
	
	System.out.println("enter the age");
	int age=sc.nextInt();
	
	System.out.println("age is "+age);
}
}
}
