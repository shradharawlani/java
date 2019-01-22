package com.learn2drive.model;
/*
 * entity/model/java bean
 */
public class Car extends Object{
	/*data members
	 * instance variables
	 */

	private String make ,model,color;
	private Engine engine;//has a relationship car has a engine containership/composition(one)/aggregation(many drivers has use many cars
	//composition car has a engine Aggregation driver has cars
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	/*
	 * instance methods
	 * accessor
	 */
	public Car()
	{
		this("","","");//call contructor of ame class that is paramater,only use in contructor
	}
	public Car(String make,String model,String color)
	{
	this.color=color;
	this.make=make;
	this.model=model;
	}
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override//annotation
	public String toString()//access sp,return,no para can change return type ,name not change
	{
		return getMake()+" --"+getModel()+"--"+getColor();
	}
//co variant
}
