package com.psl.client;

public enum FuelType {
PETROL(250),DIESEL(1440),NATURAL_GAS(2500);//objects of enum
private int combustionTemperature;
  private FuelType(int combustionTemperature)//enum constructure must be private
  {
	  this.combustionTemperature=combustionTemperature;
  }
public int getCombustionTemperature() {
	return combustionTemperature;
}

public void setCombustionTemperature(int combustionTemperature) {
	this.combustionTemperature = combustionTemperature;
	//we can write data member and member function in enum that is not possible in c c++
}
}
