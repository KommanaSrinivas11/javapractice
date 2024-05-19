package com.java.multithreading;


public class sychronized extends Thread {
	
	public synchronized void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() +" "+i);
		}
		synchronized(this)
		{
			try {
			for (int i=0;i<5;i++)
			{
				System.out.println(i*i);
				Thread.sleep(100);
				
			}
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
	

public static void main(String args[])
{
	sychronized s=new sychronized();
	
	sychronized m=new sychronized();
	sychronized k=new sychronized();
	s.start();
	m.start();
	k.start();
	
	
}

}
