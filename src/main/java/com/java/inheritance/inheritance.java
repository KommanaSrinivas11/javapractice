package com.java.inheritance;

public class inheritance {
 int id;
 String name;
	public inheritance(int id,String name)
	
	{
		this.id=id;
		this.name=name;
	}
	public void  display()
	{
		System.out.println("ID"+id+" "+ "Name"+name);
		
	}
public void display_salary(int amount)
{
	System.out.println("Salary of"+" " +name +" "+ "is"+" " +amount);
}
}
class contract extends inheritance
{
	int absent_days;
	int working_days;
	contract(int id,String name ,int working_days,int absent_days )
	{
		super(id,name);
		this.working_days=working_days;
		this.absent_days=absent_days;
		
		
	}
	public void calculate_salary()
	{ 
		int amount;
		 amount=(working_days-absent_days)*50;
		 super.display_salary(amount);
		
	}
}
	
	class fulltime extends inheritance{
		final int paid_leave=2;
		final int bonus=200;
		int absent_days;
		int working_days;
		
		  
		fulltime(int id,String name ,int working_days,int absent_days )
		{
			super(id,name);
			this.working_days=working_days;
			this.absent_days=absent_days;
		}
		public void calculate_salary()
		{
			int leaves;
			if (absent_days-paid_leave>0)
				leaves=absent_days-paid_leave;
			else
				leaves=0;
			int amount=(working_days-leaves)*50+bonus;
			super.display_salary(amount);
			
		}
		
	}
	
	
class emp {
	

	public static void main(String args[])
	{
		inheritance p=new inheritance(23,"Srinivas");
		p.display();
		contract c= new contract(5,"kanchan",23,7);
		c.calculate_salary();
		fulltime f= new fulltime(3,"Nikhil",25,2);
		f.calculate_salary();
		
		
	}   
}

