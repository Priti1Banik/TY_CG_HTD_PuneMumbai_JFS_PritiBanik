package com.capgemini.thread;

public class PVR 
{
	synchronized void confirm()        //synchronized make thread safe that is 1 thread will work at a time
	{
		for(int i=0;i<6;i++) 
		{
			System.out.println(i);

			try 
			{
				wait();
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	synchronized void leaveMe() 
	{
		notify();
		System.out.println("notified");
	}

}

