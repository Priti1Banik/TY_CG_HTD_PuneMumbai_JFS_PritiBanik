package com.capgemini.thread;

public class Patym extends Thread {

	PVR ref;

	public Patym(PVR r) {
		ref=r;
	}
	@Override
	public void run() {
		ref.confirm();
	}
}
