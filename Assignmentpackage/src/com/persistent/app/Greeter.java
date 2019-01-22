package com.persistent.app;
import com.psl.main.*;

public class Greeter {
private String name;
public Greeter(String name)
{
	this.name=name;
	
	
	
}
public String sayHello()
{
	return "hello ,"+this.name;
	
}
public String sayGoodBye()
{
	return "GoodBye"+this.name;
	
}
}
