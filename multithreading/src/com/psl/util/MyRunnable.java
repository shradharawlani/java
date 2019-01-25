package com.psl.util;

public class MyRunnable implements Runnable {
	
	@Override
	public void run()
	{
		for(int x=1;x<=5;x++)
		{
			System.out.println(String.format("%d %s",x,Thread.currentThread().getName()));
			try {
				Thread.sleep(1000);//context switch between thread sequence of thread execution canbe differ
				//states of thread
				//creata a thread object
				//new-->start()-->runnable state(ready to run not start execution)-->running state(run method code execute
				//context switch running<----->runnable--->blocked--->runnable-->running-->dead(can't be restart thread died)
				//1 when run method call complete
				//2exception throw can't catch run method call terminate then thread will die
				//3 
				
				
				
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
