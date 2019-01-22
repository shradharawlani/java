package com.psl.main;
import java.util.Scanner;

public class MyFirstJavaClass {
	public static void main(String[] args) {
		System.out.println("choose from given choices");
		System.out.println("For Even enter 1");
		System.out.println("For Prime enter 2");
		System.out.println("For Leapyear enter 3");
		System.out.println("For Valid Date enter 4");
		System.out.println("For calculate power enter 5");
		System.out.println("For calculate factorial enter 6");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		
		switch(c)
		{
		
		case 1:
		boolean ans=ControlStatement.isEven(3);
		if(ans==true)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("Given number is odd");	
		}
		break;
		case 2:
		
			boolean res=ControlStatement.isPrime(3);
			if(res==true)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not a prime number");	
			}
			break;			
	}
	}
}
