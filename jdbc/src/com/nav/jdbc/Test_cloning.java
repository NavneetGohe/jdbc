package com.nav.jdbc;

public class Test_cloning {
	public static void main(String[] args) throws Exception {
		
		Customer c1 = new Customer ("rahul");
		c1.adress.city= "indore";
		
	 Customer	c2 = (Customer)c1.clone();
	    c2.name = "ramesh";
	    c2.account.balance = 20;
	    c2.adress.city = "bhopal";
	    
	    System.out.println("Orignal product");
	    System.out.println(" name : " +c1.name);
	    System.out.println(" balance of account : " + c1.account.balance);
	    System.out.println(" city : " + c1.adress.city);
	    
	    System.out.println("------------------------");
	    System.out.println("cloned product");
	    System.out.println("name : " + c2.name);
	    System.out.println(" account balance : " + c2.account.balance);
	    System.out.println(" city : " + c2.adress.city);
	    
		
	}
	

}
