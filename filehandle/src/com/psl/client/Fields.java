package com.psl.client;

public class Fields {
 
	private String name;
	private int num;
	public Fields(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static void main(String[] args) {
		Fields f=new Fields("shradha",123);
	}
	
	
}
