package com.psl.util;

public class AccessSharedResources extends Thread {
	private SharedResource sharedResource;

	public AccessSharedResources(SharedResource sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}
	

     public void run()
     {
    	 
    	 synchronized (sharedResource) {
			System.out.println(sharedResource.readCurrentValue());

		}
     }
}