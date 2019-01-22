package com.psl.client;
import esg.itp.shape.*;

public class Main {
	public static void main(String[] args) {
		Rectangle r=new Rectangle(5,6);
		r.calculateArea();
		r.calculatePeri();
		r.display();
	
		Square s=new Square(5);
		s.calculateArea();
		s.calculatePeri();
		s.display();
		
	}

}
