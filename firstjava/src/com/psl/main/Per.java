package com.psl.main;

import java.util.Scanner;

public class Per {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String[] st=str.split("");
		for(int j=0;j<st.length*6;j++)
		{    int i=0; 
			for(int m=0;m<st.length;m++)
			{
				if(j<st.length)
				{
			 i=(m+j)%st.length;
			 System.out.print(st[i]);
				}
			else if(j>=st.length)
				{
			 i=(2*m+j)%st.length;
			 System.out.print(st[i]);
				}
			
		}			
			System.out.print("\n");
		}
}
}
