package com.psl.main;

public class ControlStatement {
	public static  boolean isLeap(int year)
	{
	 if(year%100==0&&year%400==0)
	 {
		 return true;
	 }
	 if(year%4==0&&year%400==0)
	 {
		 return true; 
	 }
	 else
	 {
		 return false;
	 }
	}
	
	public static boolean isEven(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	public static boolean isValidDate(int day,int month,int year)
	{
		if(day<=30&&(month==4||month==6||month==9||month==11))
		{
			return true;
		}
		else if(day<=31&&(month==1||month==3||month==5||month==7||month==8||month==10||month==12))
		{
			return true;
		}
		else if((day<29)&&(month==2)&&((year%100==0&&year%400==0)||(year%4==0&&year%400==0)))
		{
			return true;
		}
		else if((day<=28)&&(month==2))
				{
			return true;
				}
		else
		{
			return false;
		}
	}
	public static void power(int b,int power)
	{
		int ans=0,i;
		 for(i=1;i<power;i++)
		 {
			b=b*b;
		}
		 ans=b;
		 System.out.println(ans);
		 
	}
	public static boolean isPrime(int num)
	{
		int i,flag=0;
		
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{   
			 flag++;
			}
			
			
		}
		if(flag>=2)
		{
		return false;
		}
		else
		{
		return	true;
		}
	
}
	public static void factorial(int num)
	{
		int fact=1,i;
		 for(i=1;i<=num;i++)
		 {
			fact=fact*i;
		}
		 
		 System.out.println("Factorial of a number is"+fact);
	}
}
