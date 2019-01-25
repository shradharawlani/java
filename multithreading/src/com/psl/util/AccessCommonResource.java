package com.psl.util;

public class AccessCommonResource extends Thread {

	private CommonResource commonResource;

	public AccessCommonResource(CommonResource commonResource) {
		super();
		this.commonResource = commonResource;
	}
	@Override
	public
	void run()
	{
		try {
			commonResource.getLock();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		for(int x=0;x<commonResource.getSize();x++)
			System.out.println(commonResource.getNumber(x));
		commonResource.release();
	}
}
