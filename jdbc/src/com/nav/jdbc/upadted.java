package com.nav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class upadted {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		Statement stm = con.createStatement();
		int i = stm.executeUpdate("insert into employee values(9,'aayushi','tiwari',50000,7)");
		//System.out.println(i + "Record(s) updated");
		
		stm.close();
		con.close();

	}

}
