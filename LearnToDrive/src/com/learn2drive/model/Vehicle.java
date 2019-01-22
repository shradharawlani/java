package com.learn2drive.model;
import com.learn2drive.util.*;

public class Vehicle {
	private String registration;
	private double price;
	String name;
	FuelType fueltype;
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double sp1) {
		this.price = sp1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FuelType getFueltype() {
		return fueltype;
	}
	public void setFueltype(FuelType sp1) {
		this.fueltype = sp1;
	}
	

}
