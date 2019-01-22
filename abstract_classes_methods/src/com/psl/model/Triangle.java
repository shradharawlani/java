package com.psl.model;

public  class Triangle extends Shape {
	private double s1,s2,s3;

	public Triangle(double s1, double s2, double s3) {
		super("Trianle");
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	public double getS1() {
		return s1;
	}

	protected void setS1(double s1) {
		this.s1 = s1;
	}

	public double getS2() {
		return s2;
	}

	protected void setS2(double s2) {
		this.s2 = s2;
	}

	public double getS3() {
		return s3;
	}

	protected void setS3(double s3) {
		this.s3 = s3;
	}
	public  void calculateArea(){
	
		/*double s=(getS1()+getS2()+getS3())/2;
		setArea(Math.sqrt(s*(s-getS1())*(s-getS2())*(s-getS3())));//set area shape class method*/
		if(getS1()==getS2()&&getS2()==getS3())
		{
			Equilateral e=new Equilateral(getS1(),getS2(),getS3());
			e.calculateArea();
		}
		else if(getS1()==getS2()||getS2()==getS3())
		{
			Isoceles i=new Isoceles(getS1(),getS2(),getS3());
			i.calculateArea();
		}
		else
		{
			Scalene s=new Scalene(getS1(),getS2(),getS3());
			s.calculateArea();
		}
	}
	
    public void calculatePerimeter()
    {   
    	setPerimeter((getS1()+getS2()+getS3())/2);
    }
	

}
