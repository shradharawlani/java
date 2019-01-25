package com.psl.util;

import java.util.Random;

public class CommonResource {
private int numbers[];
private boolean available;
private Random random;
public CommonResource(int[] numbers, boolean available, Random random) {
	super();
	numbers = new int[50];
	available = true;
	random = new  Random();
}
//acquiring and releasing lock

public int getSize()
{
	return numbers.length;
}

public int generateNumber()
{
	int num;
	do
	{
		num=random.nextInt();
		
	}while(num<0||num>0x3e8);
	return num;
}
public synchronized  void getLock() throws InterruptedException//call by thread
{
	if(available==false)
	{

			wait();//wait method call only by synchronized method
		
			
	}
	available=false;
}
public synchronized void release()
{
	available=true;
	notifyAll();//this method also call by synchronized method
}
public CommonResource() {
	super();
	// TODO Auto-generated constructor stub
}

public int getNumber(int index)
{
	return numbers[index];
}
public void setNumbers(int index,int value)
{
	numbers[index]=value;
}


//commonResource two object share between two thread

}
