package com.psl.client;

import java.io.Serializable;


public class Engine implements Serializable {
	//private static final Long S
	private double horsePower;
	private int cubicCapacity;
	private  FuelType fuelType;
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	public Engine(double horsePower, int cubicCapacity, FuelType fuelType) {
		super();
		this.horsePower = horsePower;
		this.cubicCapacity = cubicCapacity;
		this.fuelType = fuelType;
	}

}
