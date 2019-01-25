package com.psl.client;

import com.psl.util.AccessSharedResources;
import com.psl.util.SharedResource;
import com.psl.util.UpdateSharedResource;

public class SynchronizationDemo {

	public static void main(String[] args) {
		SharedResource  sharedResources;
		sharedResources=new SharedResource(100000000000000000L);
        new UpdateSharedResource(sharedResources).start();
        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        new AccessSharedResources(sharedResources).start();
	}
          
}
