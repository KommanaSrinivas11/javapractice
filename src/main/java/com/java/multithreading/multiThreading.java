package com.java.multithreading;

public class multiThreading extends Thread {

	public void run()
	
	{
		System.out.println("to check");
	}

public static void main(String args[])
{
	multiThreading m= new multiThreading();
	m.start();
	
}
}
