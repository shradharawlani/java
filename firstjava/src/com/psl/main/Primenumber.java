package com.psl.main;
import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int i,flag=0;
		
			for(i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					System.out.println(" not prime number");
					flag=1;
					break;
					
				}
				if(flag==0)
				{
					System.out.println("  prime number");
				}
			}
		
		
	}
	

}
