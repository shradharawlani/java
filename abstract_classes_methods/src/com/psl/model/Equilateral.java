package com.psl.model;

public class Equilateral extends Triangle {
	
	

	public Equilateral(double s1, double s2, double s3) {
		super(s1, s2, s3);
		// TODO Auto-generated constructor stub
	}

	public void calculateArea()
	{
		double s=(getS1()+getS2()+getS3())/2;
		setArea(Math.sqrt(s*(s-getS1())*(s-getS2())*(s-getS3())));
	}

}
