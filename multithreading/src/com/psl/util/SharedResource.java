package com.psl.util;

public class SharedResource {
	
	//one objects share between multiple thread share
	private long cycles;
	public SharedResource(long cycles)
	{
		this.cycles=cycles;
	}
	/*public synchronized void startCycles()
	{
		while(--cycles>0);
	}
	public synchronized long readCurrentValue()
	{
		return cycles;
	}*/
	public void startCycles()
	{
		while(--cycles>0);
	}
	public long readCurrentValue()
	{
		return cycles;
	}
	
}
