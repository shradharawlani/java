package com.psl.main;

import java.util.Scanner;
import java.util.regex.*;

public class ConatctDetails {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Your  first name");
		String fName=s.nextLine();
		System.out.println("enter Your  Last name");
		String lName=s.nextLine();
		System.out.println("enter Your Date of birth ");
		String dob=s.nextLine();
		System.out.println("enter Your email");
		String email=s.nextLine();
		System.out.println("enter Your Telephone");
		int tele=s.nextInt();
		System.out.println("enter Your Mobile number");
		int mob=s.nextInt();
		
		try
		{
			validate("sd","df","sd","df",2,0);//fName,lName,dob,email,tele,mob);
		}
		catch(ProductNotFoundException ex)
		{
			
		
		 System.out.println(ex.getMessage());
	 }
		
		
		
	}
	public static void validate(String fName,String lName,String dob,String email,int tele,int mob) throws ProductNotFoundException//can also write throw exception,give multiple express by comma
	 {
		Pattern p=Pattern.compile("[a-zA-Z]*[0-9]*@[a-zA-Z]*.[a-zA-Z]*");
		 
		
		 Matcher m=p.matcher(email);
		 boolean b=m.matches();
		if(fName==""||lName==""||email==""||dob=="")
		{
			throw new ProductNotFoundException("Not found");
		}
		else if(tele==0&&mob==0)
		{
			throw new ProductNotFoundException("Not found");
		}
		
		
		 else if(b==true)
		 {
		 System.out.println("Valid Email ID");
		 }
		
		 else
		 {
		 System.out.println("InValid Email ID");
		 }
			}
}