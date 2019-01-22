package com.psl.main;
import java.util.*;

public class EnterDetails {
	
	public static void main(String[] args) {
		Contact c=new Contact();
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter first name");
	    String fname=s.next();
	    c.setFirst_name(fname);
	    System.out.println("enter Middle name");
	    String mname=s.next();
	    c.setFirst_name(mname);
	   
	    System.out.println("enter last name");
	    String lname=s.next();
	    c.setLast_name(lname);
	    System.out.println("enter Date of Birth");
	    String Dob=s.next();
	    c.setDob(Dob);
	    System.out.println("enter Gender");
	    String gen=s.next();
	    c.setGender(gen);
	    System.out.println("Anniversary");
	    String anni=s.next();
	    c.setAnniversary(anni);
	    System.out.println("enter Address");
	    String add=s.next();
	    c.setAddress(add);
	    System.out.println("enter Area");
	    String area=s.next();
	    c.setArea(area);
	    System.out.println("enter city");
	    String city=s.next();
	    c.setCity(city);
	    
	    System.out.println("enter state");
	    String state=s.next();
	    c.setState(state);
	    System.out.println("enter country");
	    String country=s.next();
	    c.setCountry(country);
	    
	    System.out.println("enter Email");
	    String email=s.next();
	    c.setEmail(email);
	    System.out.println("enter website");
	    String website=s.next();
	    c.setWebsite(website);
	    
	    System.out.println("pin");
	   int pin=s.nextInt();
	    c.setPincode(pin);
	    System.out.println("mobile");
		   int mob=s.nextInt();
		    c.setMobile(mob);
		    System.out.println("telephone");
			   int tele=s.nextInt();
			    c.setTelephone(tele);
			    
			    System.out.println(c.getFirst_name());
			    System.out.println(c.getMiddle_name());
			    System.out.println(c.getLast_name());
			    System.out.println(c.getDob());
			    System.out.println(c.getGender());
			    System.out.println(c.getAnniversary());
			    System.out.println(c.getAddress());
			    System.out.println(c.getArea());
			    System.out.println(c.getState());
			    System.out.println(c.getCity());
			    System.out.println(c.getCountry());
			    System.out.println(c.getEmail());
			    System.out.println(c.getWebsite());
			    System.out.println(c.getPincode());
			    System.out.println(c.getTelephone());
			    System.out.println(c.getMobile());
			    
	}
	
	

	
	

}
