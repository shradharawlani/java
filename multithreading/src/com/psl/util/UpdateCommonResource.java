package com.psl.util;

public class UpdateCommonResource extends Thread{
private CommonResource commonResource;
public UpdateCommonResource(CommonResource commonResource)
{
	this.commonResource=commonResource;
}
public void run()
{
	try {
		commonResource.getLock();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	for(int x=0;x<commonResource.getSize();x++)
	 commonResource.setNumbers(x, commonResource.getNumber(x));
	commonResource.release();

}
}
