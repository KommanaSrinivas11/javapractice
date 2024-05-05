package com.java.encapsulation;

class demo
{
	private int roll;
	private String name;
	
	int getRollNumber()
	{
		return roll;
	}
	void  setName(String name)
	{
		this.name=name;
	}
	void  setNumber(int n)
	{
		this.roll=n;
	}
	String getName()
	{
		return name;
	}
	
	
}

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		d.setName("Srinivas");
		d.setNumber(10);
		System.out.println(d.getName());

	}

}
