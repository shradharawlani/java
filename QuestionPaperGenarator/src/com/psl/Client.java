package com.psl;

import com.util.DataManager;
import com.util.DataManagerImpl;

public class Client {
	public static void main(String[] args) {
	DataManagerImpl dm=new DataManagerImpl();
	System.out.println(dm.populateData());
	
	}
}
