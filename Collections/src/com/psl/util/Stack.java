package com.psl.util;

public class Stack <T>{//generic type representation of any data type you can give name such as my customer but usually single alphabet name
	private int top,size;
	/*private String data[];
	public Stack(int size) {
		this.size = size;
		data=new String[size];
	}
	public void push(String value)
	{
		
	}
	public String pop()
	{
		return null;
	}
	public String peek()
	{
		return null;
	}
	public int getSize() {
		return size;
	}
	private Object data[];
	public Stack(int size) {
		this.size = size;
		data=new Object [size];
	}
	public void push(Object  value)
	{
		
	}
	public Object pop()
	{
		return null;
	}
	public Object  peek()
	{
		return null;
	}
	public int getSize() {
		return size;
	}
	*/
	private T data[];
	public Stack(int size) {
		this.size = size;
		//data=new T[size]; type not know then how allocate memory
	}
	public void push(T value)
	{
		
	}
	public T pop()
	{
		return null;
	}
	public T peek()
	{
		return null;
	}
	public int getSize() {
		return size;
	}

}
