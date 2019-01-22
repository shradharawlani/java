package com.psl.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		try(FileInputStream fi=new FileInputStream(new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\koala.jpg"));
				FileOutputStream fo=new FileOutputStream(new File("new-kola.jpg")))//not give path than file create in current project folder if already have than override
		//try with resources automatic close both file
				{   
		int bytesread;
		/*while((byteread=fi.read())!=-1)
		{
			fo.write(byteread);
		}*/
			byte data[]=new byte[1024];
			while((bytesread=fi.read(data))!=-1)
			{
				fo.write(data,0,bytesread);
			}
			
	        
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	//read file present on disk only used for filr not for input output also use in UNC path\\192.453.1.10\some-folder\some filename that locate at another computer
			//same network,represent path

	}

}
