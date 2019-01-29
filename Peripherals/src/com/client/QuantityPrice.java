package com.client;

import java.util.Comparator;

import com.beans.Peripheral;

public class QuantityPrice implements Comparator<Peripheral> {

	@Override
	public int compare(Peripheral p1, Peripheral p2) {
		if(p1.getQuantity()-p2.getQuantity()==0)
		return p1.getPrice()-p2.getPrice();
		
		return p1.getQuantity()-p2.getQuantity();
		
		
	}

}
