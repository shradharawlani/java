package com.psl.model;

public class Rectangle extends Shape {
private double length,breath;
public Rectangle(double length,double breath)
{
	super("Rectangle");
	this.breath=breath;
	this.length=length;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getBreath() {
	return breath;
}
public void setBreath(double breath) {
	this.breath = breath;
}

public void calculateArea()
{
	setArea(getLength()*getBreath());//set area shape class method
}
public void calculatePerimeter()
{
	setPerimeter(2*(getLength()+getBreath()));
}
}
