package com.psl.model;

public class Circle extends Shape {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(double radius)
	{
		super("circle");
		this.setRadius(radius);
	}
	public void calculateArea()
	{
		setArea(Math.PI*getRadius()*getRadius());//set area shape class method
	}
    public void calculatePerimeter()
    {
    	setPerimeter(2*Math.PI*getRadius());
    }
}
