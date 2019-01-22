package com.persistent.app;
import com.psl.main.*;
import java.util.Random;

public class Advisor {
public String[] message=new String[5];
public Advisor()
 {
	message[0]="hello";
	 message[1]="hello1";
	message[2]="hello2";
	message[3]="hello3";
	message[4]="hello4";
	
	
	
 }
 public String getAdvice()
 
 {
	 Random rn = new Random();
	int i = rn.nextInt(4) + 0;
	  return message[0];
 }
}
