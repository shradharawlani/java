package com.psl.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class character {
 public static void main(String[] args) {
	/*try(FileOutputStream fo=new FileOutputStream("psl.txt"))
	{   String s="hello shradha";
	byte[] data=s.getBytes();
		fo.write(data);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	/* try(FileInputStream fi=new FileInputStream("psl.txt"))
	 {
		 int i=0;
		 while((i=fi.read())!=-1)
				 {
			       System.out.print((char)i);
				 }
	 } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	/* 
	 try(FileOutputStream fo=new FileOutputStream("psl1.txt");
			 FileInputStream fi=new FileInputStream("psl.txt"))
		{  
		 int i=0;
		 while((i=fi.read())!=-1)
		 {
		
			fo.write(i);
		 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 */
	 /*try(FileInputStream fi1=new FileInputStream("psl.txt");
			 
			 FileInputStream fi2=new FileInputStream("psl1.txt");
			  SequenceInputStream se=new SequenceInputStream(fi1,fi2))
			 {
		 
		   int i=0;
		   while((i=se.read())!=-1)
		   {
			   System.out.print((char)i);
		   }
		 
		 
		 
			 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
	 
	 
	 
	 */
try(FileInputStream fi1=new FileInputStream("psl.txt");
			 FileOutputStream fo=new FileOutputStream(new File("psl2.txt"));
			 FileInputStream fi2=new FileInputStream("psl1.txt");
			  SequenceInputStream se=new SequenceInputStream(fi1,fi2))
			 {
		 
		   int i=0;
		   while((i=se.read())!=-1)
		   {
			   fo.write(i);
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
