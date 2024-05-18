package com.java.multithreading;

public class multiThreading extends Thread {

	public void run()
	
	{
		for (int i=0;i<5;i++)
		{
		System.out.println(i);
		try {
		
		
		Thread.sleep(3000);
		
		
		
		}
		catch(InterruptedException e)
		{
		System.out.println("Exception occured");
		
		}
		
	}
	}

public static void main(String args[])
{
	multiThreading m= new multiThreading();
	multiThreading n= new multiThreading();
	m.start();
	
	try {
	m.join();
		
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	
	n.start();
}
}
