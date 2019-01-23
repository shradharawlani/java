package com.psl.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class UserInterface {

	public static void main(String[] args) {
		List<String> str;
		str=new ArrayList<String>();//dynamic array come with initial 10 capacity of array
		str.add("new");
		str.add("new");
		str.add("Everyday");
		System.out.println(str.get(2));
		//System.out.println(str.remove(0));
		System.out.println(str.size());
		for(String s:str)
		{
			System.out.println(s);
		}
		if(str.contains("Everyday"));
		{
			
		}
        //if(str.indexOf("new"))//index of str not match return -1
       
       Iterator<String> itr=str.iterator();//interface
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
       ListIterator<String> lst_itr=str.listIterator();
       while(lst_itr.hasPrevious())
       {

       System.out.println(lst_itr.previous());
       
       
       }
	}
       }