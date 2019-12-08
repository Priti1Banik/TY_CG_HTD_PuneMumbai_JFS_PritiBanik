package com.capg.corejava.basics;

interface Message {
	void gm();
}

public class Demo3 {
public static void main(String[] args) {
	Message m=()->System.out.println("gd mrng");
m.gm();
}
}
