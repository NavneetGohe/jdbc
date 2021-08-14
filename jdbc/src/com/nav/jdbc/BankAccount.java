package com.nav.jdbc;

public class BankAccount  implements Cloneable{
	public double balance = 0;
	
	public BankAccount (double b) {
		balance =b;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BankAccount a1 = new BankAccount(100);
		BankAccount a2 =(BankAccount)a1.clone();
		a2.balance=200;
		System.out.println(a1.balance);
		System.out.println(a2.balance);
		
	}
	
	
 

}
