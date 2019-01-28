package com.psl.main;
import java.util.HashMap;
import com.psl.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.psl.util.*;

public class Client {

	public static void main(String[] args) {
		/*Stack<String> s=new Stack<String>(10);//datatype should be class and interface
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
		System.out.println("========================");
		Set<BankAccount> acs;
		acs=new HashSet<BankAccount>();
		acs.add(new BankAccount("42345",546));
		acs.add(new BankAccount("56765",78));//same account number not be added no object replace and override not in same squence output list with not mendatory to override 
		//but with set mendatory to override equal hash because it give uniqueness
		acs.add(new BankAccount("56765",78.7));
		System.out.println(acs.size());
		for(BankAccount ac:acs)
		{
			System.out.println(ac);
		}
		
		System.out.println("========================");
		//sorted set are preorder set arrange the objects in particular order ascen  desc every object is unique
		SortedSet<BankAccount> sortedBankAccounts;
		
		sortedBankAccounts=new TreeSet<BankAccount>();//implements comparable interface in bankaccountclass

		sortedBankAccounts.add(new BankAccount("42345",546.7));
		
		sortedBankAccounts.add(new BankAccount("42348",546.7));//return 0 by comparable not add in set
		sortedBankAccounts.add(new BankAccount("42349",548.3));
		sortedBankAccounts.add(new BankAccount("42344",549.1));
		
		for(BankAccount ac:sortedBankAccounts)
		{
			System.out.println(ac);
		}
		System.out.println("========================");
		sortedBankAccounts=new TreeSet<BankAccount>(new BankAccountFullNameComparatable());//sort by name
		sortedBankAccounts.add(new BankAccount("shradha","42348",546.7) );
		sortedBankAccounts.add(new BankAccount("Richa","42348",546.7) );
		sortedBankAccounts.add(new BankAccount("Aishwariya","42348",546.7) );
		for(BankAccount ac:sortedBankAccounts)
		{
			System.out.println(ac);
		}
		System.out.println("========================");
		Set<BankAccount> accountObjects=new LinkedHashSet<BankAccount>();//unique value but use linked list maintain insertion order linkhash a
		//maintain hashset to maintain order of insert and return fetch data by database use hash set to maintain order
		//accountObjects.add(new BankAccount("aaa","235",5474.6));
		//accountObjects.add(new BankAccount("bbb","239",5479.6));
		//accountObjects.add(new BankAccount("ccc","235",5478.6));
		for(BankAccount ac:accountObjects)
		{
			System.out.println(ac);
		}*/
		System.out.println("========================");
		
		Map<String,BankAccount> m;//unique
		m=new HashMap<String, BankAccount>();
        m.put("2345", new BankAccount());	
        m.put("2346", new BankAccount());	
        m.put("2347", new BankAccount());
        m.put("2347", new BankAccount());//if duplicate found then replace and override the current value of this key
        System.out.println(m.get("2346"));
        
        m.containsKey("2345");//search for key
        
        
        //sorted map implement have tree class implement uique  not used foreach loop map not for iteration
        for(Map.Entry<String, BankAccount>ac:m.entrySet())
        {
        	System.out.println(ac.getKey());
        	System.out.println(ac.getValue());
        }
		
		
		Map<Aadhar,List<BankAccount>> data;
		//data=new TreeMap();//order everything by key key value comprable implements in aadhar class
		//data=new hashmap(); for i
		//public static Map<Aadhar,List<BankAccount>> readFromFile(String fileName)
		{
	
		}
		
		//public static void fetchAccountDetailsFromDb(Map<Aadhar,List<BankAccount>> data)
		{
	
		}
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
