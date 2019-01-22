package com.psl.main;
import java.util.Scanner;

public class LinearSearch {
	public static  boolean linearSearch(int ...arg)
	{
		int arr[]=arg;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to be search ");
		int num=s.nextInt();
		for(int index:arr)
		{
			if(index==num)
			{
				return true;
			}
			
		}
		return false;
		
	}
public static int[] sort(int ...arg)
{
	int arr[]=arg;
	int i,j;
	for(i=0;i<arr.length;i++)
	{
		for(j=i+1;j<arr.length;j++)	
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}

}
