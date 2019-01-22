package com.psl.util;

public class BankAccount {
	private String number;
	private double balance;
	public BankAccount() {
		super();
		
	}
	public BankAccount(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
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
	return String.format("BankAccount[%s%f]",getNumber(),getBalance());

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




}