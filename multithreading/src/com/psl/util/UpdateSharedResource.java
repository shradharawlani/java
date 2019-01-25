package com.psl.util;

public class UpdateSharedResource extends Thread {
	private SharedResource sharedResource;

	public UpdateSharedResource(SharedResource sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}
     @Override
     public void run()
     {
    	 synchronized (sharedResource) {
			
    		 sharedResource.startCycles();//enter the lock state
		}
    	 
     }
}
