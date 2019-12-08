package com.capgemini.thread;

public class TestB {
	public static void main(String[] args)  
	{
		PVR a = new PVR();

		Patym t1 = new Patym(a);
		t1.start();

		Patym t2 = new Patym(a);
		t2.start();
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		a.leaveMe();
	}
}
