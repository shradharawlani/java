package com.psl.util;

import java.util.Comparator;

public class BankAccountFullNameComparatable implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount lhs, BankAccount rhs) {
		return lhs.getFullName().compareTo(rhs.getFullName());		

	}


	
}
