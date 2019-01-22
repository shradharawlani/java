package com.psl.main;
import com.persistent.app.Advisor;
import com.persistent.app.Greeter;
import com.psl.main.*;

public class GreeterTest {
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++)  
		{
			Greeter g=new Greeter(args[i]); 
			System.out.println(g.sayHello());
			
		}
		Advisor a=new Advisor();
		
		System.out.println(a.getAdvice());
		for(int i=0;i<args.length;i++)  
		{
			Greeter g=new Greeter(args[i]); 
			System.out.println(g.sayGoodBye());
		}
		
	}

}
