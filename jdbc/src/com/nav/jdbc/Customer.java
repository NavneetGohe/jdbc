package com.nav.jdbc;

public class Customer implements Cloneable {
	public String name = null;
	public BankAccount account = null;
	public Customer_Address adress= null;
	
	public Customer(String n) {
		name = n;
		account = new BankAccount(10);
		adress = new Customer_Address();
	}
	 public Object clone() throws CloneNotSupportedException {
		 Customer c = (Customer)super.clone();
		 c.account = (BankAccount)account.clone();
		 return c;
		 
		 
	 }
	

}
