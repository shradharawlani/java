package com.learn2drive.client;
import com.learn2drive.model.*;
import com.learn2drive.util.FuelType;

import static java.lang.Math.sqrt;
public class Client {
public static void main(String[] args) {
	Car xuv,baleno;
	//com.learn2drive.model.Car xuv,baleno; class in different namespaces
	sqrt(45);
	xuv=new Car();
	xuv.setColor("blue");
	xuv.setMake("mahinfra");
	xuv.setModel("xuv 700");
    System.out.println(xuv.getColor());
    System.out.println(xuv.getMake());
    System.out.println(xuv.getModel());
	baleno=new Car();
	baleno.setColor("pink");
	baleno.setMake("mahinfra");
	baleno.setModel("5700");
	System.out.println(baleno.getColor());
    System.out.println(baleno.getMake());
    System.out.println(baleno.getModel());
    
    SUV s=new SUV("bndjk","`234","pink",true);
    s.setColor("orange");
    s.setMake("mahindra");
    s.setModel("we123");
    s.setFourWheelDrive(true);
    s.getColor();
    s.getMake();
    s.getModel();
    s.isFourWheelDrive();
    manager(xuv);//car class string override method call
    manager(baleno);
    manager(s);//if override not done then super class to string method class that is car class callif not car objects
    
   System.out.println(xuv.toString());
   FuelType f;
   f=FuelType.NATURAL_GAS;
  System.out.println(f);
  // f. all methods are inherit from enum class by default 
	for(FuelType ft:FuelType.values())//ordin for int valueFuelType
	{
		//red s me static method no need to access by object
		System.out.println(ft);
		System.out.println(ft.getCombustionTemperature());
		FuelType.DIESEL.getCombustionTemperature();
		//FuelType.valueOf()//MPC ENUM CONVERT AND MUST BE UPPER CASE
	}
	switch(f)
	{
	case DIESEL:
	case PETROL:
	case NATURAL_GAS:
	}
}

public static void manager(Car car)//object pass
{
	//System.out.println(car.getColor());//only car class method call because car reference
	System.out.println(car.toString());//car override method xuv 
}
}
