package com.java.calculation;

class parent
{
	 int a=10;
	void sum(int a ,int b)	{
		System.out.println(a*b);
		
	}
}
class child extends parent

{
@Override
	void sum(int a,int b)
	{
		
		System.out.println(super.a+b);
	}
}

public class override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p= new parent();
		p.sum(2,3);
		child c =new child();
		c.sum(2,3);

	}

}
