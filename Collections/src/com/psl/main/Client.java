package com.psl.main;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

import com.psl.util.*;

public class Client {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>(10);//datatype should be class and interface
		s.push("Today is");
		s.push("is");
		s.push("Tuesday");
		System.out.println(s.peek());
		System.out.println(s.pop());
		//s.push(new Date()); compilation error
		//String v=(String)s.pop();//classcastexception date can't convert to string generic introduce in java type safety
		String v=s.pop();// not need to convert already return string
		
		NumberContainer<Double> dbl=new NumberContainer<Double>();
		NumberContainer<Long> inl=new NumberContainer<Long>();//object of class
	//but you can't dp dbl=inl
		//dbl.hasSameAverage(inl);//pass double object not other after wildcard we can pass any type of long double short
		List<BankAccount> accounts;//vector is thread save
		accounts=new LinkedList<BankAccount>();
		
		
		accounts.add(new BankAccount("42345",546));
		accounts.add(new BankAccount("56765",78));
		accounts.add(new BankAccount("7868",76));
		for(BankAccount ac:accounts)
		{
			System.out.println(ac);//bydefault call override tostring method when object pass otherwise object class pass
		}
		if(accounts.contains(new BankAccount("42345",546)))//compare the object of each bankaccount must override equal and hash code for check unique 
		{
			System.out.println("Found");
		}
	}

}
