package com.psl.main;

public class StringReverse {
	public static void main(String[] args) {
		String s="To be or not to be ";
		String temp="";
		int length=s.length();
		int k=0,j;
		for(int i=0;i<length;i++)
		{
			k=i;
			while(s.charAt(i)!=' ')
			{
				k++;
			}
			for(j=k-1;j>=i;j--)
			{
				temp=temp+s.charAt(k);
			}
			System.out.println(temp);
		}
		
		
		
		
		
		
	}

}
