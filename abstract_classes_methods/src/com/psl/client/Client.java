package com.psl.client;
import com.psl.model.*;

public class Client {
	public static void main(String[] args) {
		Circle c=new Circle(6.4);
		Rectangle r=new Rectangle(3,4);
		Triangle t=new Triangle(4,5,6);
		/*c.calculateArea();
		c.calculatePerimeter();
		r.calculateArea();
		r.calculatePerimeter();
		t.calculateArea();
		t.calculatePerimeter();
		System.out.println(c.getName());
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		System.out.println(t.getArea());
		System.out.println(t.getPerimeter());*/

		shapeManager(c);
		shapeManager(r);
		shapeManager(t);
		
	}
	public static void shapeManager(Shape s)
	{
	    s.calculateArea();
		s.calculatePerimeter();
		System.out.println(s.getName());
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		
	}

}
