package com.psl.main;

import java.util.Random;

public class Medicine {

	public static void main(String[] args) {
		
		Medicine m[];
		Random rn = new Random();
		int answer = rn.nextInt(3) + 1;
		if(answer==1)
		{
			Medicine s=new Tablet();
			s.displayLabel();
			
		}
		if(answer==2)
		{
			Medicine s=new Syrup();
			s.displayLabel();
			
		}
		if(answer==3)
		{
			Medicine s=new Ointment();
			s.displayLabel();
			
		}

	}
 public void displayLabel()
 {
	 System.out.println("Himalaya company");
 }
}
