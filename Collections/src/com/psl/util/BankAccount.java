package com.psl.util;

public class BankAccount implements Comparable<BankAccount>{
	private String fullName;
	public BankAccount(String fullName,String number, double balance) {
		this(number,balance);
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
	private String number;
	private double balance;
	
	
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