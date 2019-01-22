package com.psl.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertyFile {

	public static void main(String[] args) {
		//mpc give property file read data from it
		Properties p=new Properties();
		try{
		p.load(new FileReader(new File("configuration.properties")));
		System.out.println(p.getProperty("os"));
		System.out.println(p.getProperty("RAM"));//case should be same
		System.out.println(p.getProperty("Storage"));
		System.out.println(p.getProperty("processor"));
		Scanner s=new Scanner(new File("df"));
		FileReader fr=new FileReader(new File("xyz"));
		BufferedReader br=new BufferedReader(fr);
		br.readLine();
		while(s.hasNext())
		{
			String line=s.next();
			Scanner token=new Scanner(line);
			token.useDelimiter(",");
			while(token.hasNext())
			{
				String value=token.next();//string buffer object can change but string objects cant change
			}
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
