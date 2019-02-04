package com.psl;

import com.util.DataManagerImpl;

public class Client {
	
	public static void main(String[] args) {
		
		DataManagerImpl im=new DataManagerImpl();
		im.populateDataFromFile("ShowDetails.ser");
	}
}
