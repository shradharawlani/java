package com.psl.client;

import java.io.ObjectStreamClass;

public class Extractfield {
	public static void main(String[] args) {
		
		ObjectStreamClass osc = ObjectStreamClass.lookup(Fields.class);  
		
	       // get the value field from ObjectStreamClass for integers  
		       System.out.println("" + osc.getField("price"));  
		 
	        // create a new object stream class for Calendar  
	      ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);  
	  
        // get the Class instance for osc2  
		        System.out.println("" + osc2.getField("hash"));  

	}

}
