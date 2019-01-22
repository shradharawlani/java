package com.learn2drive.model;

public class Sedane extends Car{
	private  boolean convertible;
	public Sedane()
	{
		convertible=false;
	}
 public Sedane(String make,String model,String color,boolean convertible)
 {
	 super(make,model,color);
	 this.convertible=convertible;
 }
	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

}
