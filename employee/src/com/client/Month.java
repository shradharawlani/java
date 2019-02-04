package com.client;

import com.bean.Payslip;

public class Month implements Comparable<Payslip> {

	@Override
	public int compareTo(Payslip a) {
		// TODO Auto-generated method stub
		 return a.getMonth().compareTo(a.getMonth());
	}
	

}
