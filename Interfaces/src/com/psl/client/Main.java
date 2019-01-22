package com.psl.client;

public class Main {
public static void main(String[] args) {
	driveVehicle(new Airplane());//pass object as references that implements that interfaces
	driveVehicle(new Truck());
	final double PI=3.14;
	final Vehicle v;
	v=new Vehicle();//can't declare again or assign again

}
public static void driveVehicle(Driveable d)//interface reference
{
	d.accelerate();
	d.steer();
}
}
