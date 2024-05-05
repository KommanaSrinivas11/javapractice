package com.java.calculation;
 class myclass 
{

	double mult(int a ,int b)
	{
		return a*b;
		
	}
	double mult(double a ,int b,int c)
	{
		return a*b*c;	
	}

}
public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass a= new myclass();
		System.out.println(a.mult(2,3));
		System.out.println(a.mult(89.67,3,6));
		
		
	}
	}


