package com.psl.client;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
public static void main(String[] args) {
	String str=null;
	 
	    
	    	
	    		
	    		
	    
	    	try(File in = new File("H:\\Users\\shradha_rawlani\\Desktop\\csv.txt");
	    	BufferedReader br = new BufferedReader(new File(in))
	    	{
          String row;
          while((row=br.readLine())!=null)
          {
        	  String[] data=row.split(",");
        	  for(String s:data)
      		{
      			System.out.println(s);
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
