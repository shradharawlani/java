package com.psl.main;

public class Table {
public static void main(String[] args) {
	int table[][]=new int[13][13];
	int i,j,ans;
	for(i=1;i<=12;i++)
	{
		for(j=1;j<=12;j++)
		{
			
			table[j][i]=i*j;
		}
	}
	System.out.println("\t\t\tTable of numebers 1 to 10");
	for(i=1;i<=12;i++)
	{
		for(j=1;j<=12;j++)
		{
			
			System.out.print("\t"+table[i][j]);
		}
		System.out.println("\n");
		
	}
	
}
}
