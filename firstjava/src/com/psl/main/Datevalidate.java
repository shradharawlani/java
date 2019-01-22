package com.psl.main;

import java.util.Scanner;

public class Datevalidate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the day");
		int day=s.nextInt();
		System.out.println("enter the Month");
		int month=s.nextInt();
		System.out.println("enter the Year");
		int year=s.nextInt();
		if(day<=30&&(month==4||month==6||month==9||month==11))
		{
			System.out.println("valid date");
		}
		else if(day<=31&&(month==1||month==3||month==5||month==7||month==8||month==10||month==12))
		{
			System.out.println("valid date");
		}
		else if((day<29)&&(month==2)&&((year%100==0&&year%400==0)||(year%4==0&&year%400==0)))
		{
			System.out.println("valid date");
		}
		else if((day<=28)&&(month==2))
				{
					System.out.println("valid date");
				}
		else
		{
			System.out.println("invalid");
		}
	}
	

}
