package com.learn2drive.model;

public class SUV extends Car {
	private boolean fourWheelDrive;
	public SUV()
	{   super();
		fourWheelDrive=false;
	}
 public SUV(String make,String model,String color,boolean fourWheelDrive)
 {
	 super(make,model,color);
	 this.fourWheelDrive=fourWheelDrive;
 }
	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	@Override//not all method override of object class
	public String toString()
	{
		return super.toString()+"--"+isFourWheelDrive();
	}

}
