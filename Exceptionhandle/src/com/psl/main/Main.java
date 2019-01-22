package com.psl.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
 public static void main(String[] args) {
	 try(FileReader fr=new FileReader("some-file");)//if exception not found then it will terminate current thread
	 {
		 
	 }
	 catch(IOException ex)
	 {
		 
	 }
	/* FileReader fr=null;
	try
	{
		searchProduct("CODE-001");
		 fr=new FileReader("some-file");//read from file char string not reach file end
	}
	catch(ProductNotFoundException e)//|multiple exception together)
	{
		
	}
	catch(FileNotFoundException ex)
	{
		
	}
	finally
	{
		if(fr!=null)
		{
			try
			{
				fr.close();
			}
			catch(IOException et)
			{
				et.printStackTrace();
			}
		}
	}*/
}
 public static void searchProduct(String productCode) throws ProductNotFoundException//can also write throw exception,give multiple express by comma
 {
	 throw new ProductNotFoundException("Not found");//checked Exception
 }
}
