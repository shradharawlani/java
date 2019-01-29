package com.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.beans.Peripheral;


public class Client {

	public static void main(String[] args) {
		
			Client c=new Client();
			Set<Peripheral> p=new LinkedHashSet<Peripheral>();
			c.readPeripheralInventory(p);
			System.out.println(c.sortInventoryByPrice(p));
		
				
		   
	}

	/** this method will read peripheral details from the CSV file
	given to you and populate the Set*/
	public static void readPeripheralInventory(Set<Peripheral> peripherals) {
		/* write your code here */
		
    	BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("Peripherals.txt"));
			   String row;
			      while((row=br.readLine())!=null)
			      {
			    	  String[] s=row.split(",");
			    	  Peripheral pe=new Peripheral();
			    	  pe.setItemCode(s[0]);
			    	  pe.setName(s[1]);
			    	  pe.setDescription(s[2]);
			    	  pe.setPrice(Integer.parseInt(s[3]));
			    	  pe.setQuantity(Integer.parseInt(s[4]));
			    	  peripherals.add(pe);
			    	
			      }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
   
	}

	/** this method will insert the peripheral information read earlier
	into a database table */
	public static void insertPeripheralRecords(Set<Peripheral> peripherals) {
		Connection connection=null;
		try {
			connection=new DatabaseConnectionManagetimp().getConnection();
		
	for(Peripheral ps:peripherals)
	{
	
		String itemcode=ps.getItemCode();
		String name=ps.getName();
		String des=ps.getDescription();
		int price=ps.getPrice();
		int qua=ps.getQuantity();
	
		 PreparedStatement prepareStatement;
			prepareStatement=connection.prepareStatement("insert into item values(?,?,?,?,?)");
		
			

		prepareStatement.setString(1,itemcode);
		prepareStatement.setString(2, name);
		prepareStatement.setString(3, des);
		prepareStatement.setInt(4,price);
		prepareStatement.setInt(5, qua);
		prepareStatement.executeUpdate();
			
		
	}} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
		
		
		
		
		
		
		
	}

	/** this method will sort a given Set by price in the ascending order.
	It will create a new ordered Set and return it. */
	public static Set<Peripheral>  sortInventoryByPrice(Set<Peripheral> peripherals) {
		         Set<Peripheral> p=new TreeSet<Peripheral>(new QuantityPrice());
		       
				
		     	p.addAll(peripherals);
				
							
		
		return p;
	}

	/** this method will sort a given Set by quantity in the ascending order.
	Peripherals with the same quantity should be sorted amongst themselves 
	by price in the ascending order. It will return a new Set with the sorted objects */
	public static Set<Peripheral>  sortInventoryByQuantityPrice(Set<Peripheral> peripherals) {
		Set<Peripheral> p=new TreeSet<Peripheral>();
	       
		
     	p.addAll(peripherals);
		return null;
	}

	/** this method will return a new Set with records filtered from an existing Set on the basis
	of price. Both prices are inclusive. */
	public static Set<Peripheral> filterInventoryByPrice(int startingPrice, int endingPrice, Set<Peripheral> peripherals) {
		/* write your code here */
		Set<Peripheral> s=new LinkedHashSet<Peripheral>();
		for(Peripheral p:peripherals){
			if(p.getPrice()>=startingPrice&&p.getPrice()<=endingPrice)
				s.add(p);
			}
		return s;
	}
}
