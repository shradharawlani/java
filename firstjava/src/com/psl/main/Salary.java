package com.psl.main;

public class Salary {
	public static void salary()
	{
	double basicSal,dearallo,houseRent,gross,income,net;
	basicSal=50000;
	dearallo=(basicSal*10)/100;
	houseRent=(basicSal*7)/100;
	gross=basicSal+dearallo+houseRent;
	income=gross*8/100;
	net=gross-income;
	System.out.println("Netsalary is"+net);

}
}