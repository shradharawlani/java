package com.learn2drive.client;

import com.learn2drive.model.Vehicle;
import com.learn2drive.util.FuelType;



public class EnumAss {
 public static void main(String[] args) {
	String s[]={"MH-31-3656,124578.00,Dominar,Natural_gas","MH-49-6768,36568.00,Activa,Petrol",
 "MH-20-5676,376895,BMW-GS,Diesel"};
	Vehicle var[]= readCSV(s);
	for(int i=0;i<3;i++)
	{
		System.out.println(var[i].getRegistration());
	}
	
	
}
 public static Vehicle[] readCSV(String[]  data)
 
 {       Vehicle var[]=new Vehicle[3];
         String str[]=data;
         for(int i=0;i<str.length;i++)
         {
        	 str[0]=data[0];
         }
         String sp1[],sp2[],sp3[];
         
         sp1=str[0].split(",");//private double price;
     	String name;
    	FuelType fueltype[]={};

         sp2=str[1].split(",");
         sp3=str[2].split(",");
         double price[]=new double[3];
       
         
        	 price[0]=Double.parseDouble(sp1[1]);
        	 price[1]=Double.parseDouble(sp2[1]);
        	 price[2]=Double.parseDouble(sp3[1]);
        	 
        	 fueltype[0]=FuelType.valueOf(sp1[3]);
        	 fueltype[1]=FuelType.valueOf(sp2[3]);
        	 fueltype[2]=FuelType.valueOf(sp3[3]);
            for(int i=0;i<3;i++)
            {
            var[i].setRegistration(sp1[i]);
            }
            for(int i=0;i<=3;i++)
            {
            var[i].setPrice(price[i]);
            }
            
            for(int i=0;i<=3;i++)
            {
            var[i].setName(sp1[i]);
            }
            for(int i=0;i<=3;i++)
            {
            var[i].setFueltype(fueltype[i]);
            }
            
         
      	return var;
	 
}
}
