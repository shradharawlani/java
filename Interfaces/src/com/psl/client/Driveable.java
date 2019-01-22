package com.psl.client;

public interface Driveable {
	//public static final int i=100 bydefault final
	
	public default void accelerate(){
		//by default abstract,public helicopter not need create object 
	}
	
	public void steer();

	
	
}
