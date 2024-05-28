

package com.java.Collection;
import java.util.*;

public class arrayList {
	public static  void main(String args[])
	{
	
	ArrayList<String> list = new ArrayList<String>();
	
	
	list.add("Ravi");
	list.add("Ravi");  
	list.add("Ajay");  
	System.out.println(list.get(0));
	
	Iterator it = list.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());  
	}
	
	
	}
}
