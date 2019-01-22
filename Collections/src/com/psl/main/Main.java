package com.psl.main;
class X
{}
class Y extends X
{}
class Z extends Y
{}
class GenericClass<T>
{
	public void add(T val)
	{}
	public T get()
	{
		return null;
	}
}
public class Main {

	public static void main(String[] args) {
		GenericClass<? extends X> ref;
		ref=new GenericClass<X>();
		ref=new GenericClass<Y>();
		ref=new GenericClass<Z>();//1
        //ref.add(new X()); can't allow the x is super class
		ref.get();
		GenericClass<? super Y> nref;
		nref=new GenericClass<Y>();
		nref=new GenericClass<X>();
		nref=new GenericClass<Object>();
		nref.add(new Y());
		nref.add(new Z());
		nref.get();
		GenericClass c=new GenericClass();//raw type
		
		
	}
	public static<T> boolean linearSearch(T val,T data[])//generic method written in non generic class we can give local variable also
	{
		return false;
	}

}
