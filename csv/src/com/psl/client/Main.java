package com.psl.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
public static void main(String[] args) {
	String str=null;
	try
	{

		  FileInputStream fin=new FileInputStream("csv.txt");    
		  BufferedInputStream bin=new BufferedInputStream(fin);    

		int i,j=0;
		while((i=bin.read())!=-1)
		{
			
			char[] c=new char[100];
			c[j]=(char)i;
			
			
			j++;
			
			//System.out.print(str.copyValueOf(c).trim());
			
			String[]  field;
			String[]  data=null;
			  field=str.copyValueOf(c).trim().split(",");
			
			 for(String s:field)
			 {
				System.out.print(s);
				data[0]=s;
			 }
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
