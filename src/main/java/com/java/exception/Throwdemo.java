package com.java.exception;
import java.util.*;


class EvenException extends Exception
{
	public EvenException(String s)
	{
		super(s);
	}
}

public class Throwdemo {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			try {
		
			throw new EvenException("Even Number");
			}
			catch(EvenException e)
			
			{
				System.out.println(e);
			}
		}
		else
			System.out.println("Odd Number");

	}

}
