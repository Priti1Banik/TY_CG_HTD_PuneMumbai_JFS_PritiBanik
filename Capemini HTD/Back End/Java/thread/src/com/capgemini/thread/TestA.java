package com.capgemini.thread;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main started");
		Pen p = new Pen();
	p.start();   //internally calls the run method of thread
	Pen t = new Pen();
	t.start();
	try {
		t.join();    // this will wait the main method to join the child thread and then execute together
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("main ended");
	}
}
