package com.psl.client;

import com.psl.util.MyRunnable;
import com.psl.util.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
		//thread objects same thread created + 1 main thread
		MyThread t1=new MyThread("first");
		MyThread t2=new MyThread("Second");
		MyThread t3=new MyThread("Third");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();//called  by a thread on a thread, main thread calling it,t1,t2,t3 main thread enter the block state till t1,t2,t3 not complete   
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyRunnable r1=new MyRunnable();
		MyRunnable r2=new MyRunnable();
		MyRunnable r3=new MyRunnable();
		Thread t4=new Thread(r1,"fourth");
		Thread t5=new Thread(r1,"fifth");
		Thread t6=new Thread(r1,"sixth");
		t4.start();
		t5.start();
		t6.start();
	//	t3.setPriority(10);
		

	}
}
