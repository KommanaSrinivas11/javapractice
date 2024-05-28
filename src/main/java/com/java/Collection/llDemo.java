package com.java.Collection;
import java.util.*;
public class llDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li =new LinkedList<String>();
		Stack<String> st =new  Stack<String>();
		
		st.push("bot");
		st.push("bottt");
		st.pop();
		
		System.out.println(st.peek());
		
		li.add("Bhanu");
		li.add("Bobby");
		li.add("Kiran");
		
		Iterator<String> it=li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
Iterator<String> i=st.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
	}

}
}
