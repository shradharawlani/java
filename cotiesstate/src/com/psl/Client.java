package com.psl;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.exception.CityNotFoundException;
import com.exception.InvalidStateException;
import com.util.DataManager;
import com.util.DataManagerImpl;


public class Client {
	
	public static void main(String[] args) throws CityNotFoundException {
       DataManagerImpl im=new DataManagerImpl();
       Map<String,List<String>> sc=new HashMap<String, List<String>>();
       try {
		sc=im.populateCityDataMap("StateCityDetails.txt");
	List<String> ll=	im.getCities(sc, "Madhya Pradesh");
	System.out.println(ll);
	
	System.out.println(im.getState(sc,"Bhopal"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidStateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}