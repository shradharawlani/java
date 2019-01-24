package com.psl.client;

import java.util.Date;

public class BankAccount implements Comparable<BankAccount>{
	private String fullName;
	private String number;
	public Date getOpenedOn() {
		return openedOn;
	}


	public void setOpenedOn(Date openedOn) {
		this.openedOn = openedOn;
	}
	private double balance;
	private Date openedOn;
	public BankAccount(String fullName,String number, double balance,Date openedOn) {
		this(number,balance);
		this.openedOn=openedOn;
		this.fullName = fullName;
	}
	
	
	public BankAccount(String number, double balance) {
		super();
		
		this.number = number;
		this.balance = balance;
	}
	public BankAccount() {
		super();
		
	} String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
@Override
public String toString()
{
	return String.format("BankAccount[%s,%s,%f]",getFullName(),getNumber(),getBalance());

}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((number == null) ? 0 : number.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	BankAccount other = (BankAccount) obj;
	if (number == null) {
		if (other.number != null)
			return false;
	} else if (!number.equals(other.number))
		return false;
	return true;
}
@Override
public int compareTo(BankAccount anotherAccount) {//for treeset order bankaccount objects on the basic bankaccount balance
	if(getBalance()>anotherAccount.getBalance())
		return 1;
	else if(getBalance()<anotherAccount.getBalance())
		return -1;
	
	return 0;
}




}