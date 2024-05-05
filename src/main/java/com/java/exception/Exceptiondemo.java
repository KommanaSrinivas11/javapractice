package com.java.exception;

public class Exceptiondemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
// comment line
  int a=100;
   
  try
  {
	  System.out.println("Try block entered");
	  int c=a/0;
	  String s=null;
		 
	  System.out.println(s.length());
  }
  catch(ArithmeticException e)
  {
	  System.out.println("Exception occured"+e);
  }
 

  
  catch(NullPointerException e)
  {
	  System.out.println("Exception 2"+e);
  }
  finally
  {
	  System.out.println("Finally block executed");
  }
  
	}

}
