package com.psl.client;
import java.io.*;

public class UserInterface {
	public static void main(String[] args) {
		
	
	Car car=new Car();
	car.setMake("audi");
	car.setModel("aton");
	car.setColor("yellow");
	car.setEngine(new Engine(125,1000,FuelType.DIESEL));
  try( ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(new File("car.ser"))))
   {
	   oo.writeObject(car);
   }
     catch(FileNotFoundException e)
     {
    	e.printStackTrace(); 
     }
     catch(IOException e)
     {
    	 e.printStackTrace();  
     }
  try( ObjectInputStream oi=new ObjectInputStream(new FileInputStream(new File("car.ser"))))
  {
	   Car c= (Car) oi.readObject();
	   System.out.println(c.getColor());
	   System.out.println(c.getEngine().getFuelType());
  }
    catch(ClassNotFoundException e)
    {
   	e.printStackTrace(); 
    }
    catch(IOException e)
    {
   	 e.printStackTrace();  
    }
}
}