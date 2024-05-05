package com.java.calculation;
class paren
{
	String p="parent";
	void m()
	{
		System.out.println("m");
	}
	 void display()
	 {
		 System.out.println("Paret method");
	 }
}
class chil extends paren
{
	String c="child";
	void display()
	{
		System.out.print("Child method");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paren k= new chil();
		paren p=new paren();
		chil m= new chil();
		m.m();

	}

}
