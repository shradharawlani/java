package com.psl.main;

public class Reverse {
 public static void main(String[] args) {
	String s="this is java";
	String[] ch;
	ch=s.split("\\s");
	
	for(int i=0;i<ch.length;i++)
	{
		
		char[] ct=ch[i].toCharArray();
		for(int j=ct.length-1;j>=0;j--)
		{
			System.out.print(ct[j]);
		}
		
}
}
}
