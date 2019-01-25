package com.psl.client;

public class Client {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();//returns a thread object
        System.out.println(t);
        for(int x=1;x<=5;x++)
        {
        	System.out.println(x);
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
        t.setName("my main");//change name of thread
        //5(1-10) priority main thread group
        System.out.println(t);
	}

}
