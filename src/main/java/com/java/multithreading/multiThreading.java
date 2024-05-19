package com.java.multithreading;

public class multiThreading extends Thread {

	public void run()
	
	{
	System.out.println(Thread.currentThread().getName())	;
	}
		

public static void main(String args[])
{
	multiThreading m= new multiThreading();
	
	m.start();
	String n=m.getName();
	System.out.println("Thread Name"+n);
	m.setName("My Thread");
	System.out.println("Thread priority"+m.getPriority());
}
}
