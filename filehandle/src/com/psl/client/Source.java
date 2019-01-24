package com.psl.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Source {
	public static void main(String[] args) {
		/*try(FileInputStream fi=new FileInputStream(new File("C:\\com\\psl.txt"));
				FileOutputStream fo=new FileOutputStream(new File("psl.txt")))
				
				
				{
			int  bytesread;
			byte[] bytes=new byte[1024];
			 while((bytesread=fi.read(bytes))!=-1)
			 {
				 fo.write(bytes, 0, bytesread);
			 }
					
				}*/
		try(FileInputStream fi=new FileInputStream(new File("psl.txt"));
				FileOutputStream fo=new FileOutputStream(new File("psl1.txt")))
				
				
				{
			int  bytesread;
			byte[] bytes=new byte[1024];
			 while((bytesread=fi.read(bytes))!=-1)
			 {
				 fo.write(bytes, 0, bytesread);
			 }
				}
	
		catch(Exception ex)
		{
			ex.printStackTrace();
	}

}

}