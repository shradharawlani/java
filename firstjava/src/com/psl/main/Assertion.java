package com.psl.main;

public class Assertion {
	public static void main(String[] args) {
		System.out.println(calculateSpeed(55,0));
	}
private static double calculateSpeed(double distance,double time) {
	assert distance>0: "distnace should greater than zero";
	assert time>0: "time greater than zero";
	return distance/time;
	}

}
