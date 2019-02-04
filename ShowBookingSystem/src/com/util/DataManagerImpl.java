package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.bean.Show;
import com.exception.InvalidSeatNumberException;
import com.exception.SeatsNotAvailableException;
import com.exception.UnknownShowException;

//Override and implement all the methods of DataManger Interface in this class
public class DataManagerImpl implements DataManager{

	  Show show=new Show();
	public List<Show> populateDataFromFile(String fileName) {
		 try {
			ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(fileName));
			oo.writeObject(show);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try
		 {
			 ObjectInputStream or=new ObjectInputStream(new FileInputStream("ShowDetails.ser"));
			 Show show=(Show)or.readObject();
		 }
		 catch(Exception e)
		 {
			 
		 }
		 List<Show> li=new ArrayList<Show>();
		 show.getShowName();
		 
		return null;
	}

	public void bookShow(List<Show> showList, String showName,
			String show_time, int noOfSeats) throws SeatsNotAvailableException,
			UnknownShowException, InvalidSeatNumberException {
		// TODO Auto-generated method stub
		
	}
	
}
