package com.nav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbc {
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	Statement stm = con.createStatement();
	int i = stm.executeUpdate("delete from employee where id =1");
	
	//while (rs.next()) {
		//System.out.print(rs.getString("id"));
		//System.out.print("\t"+rs.getString("fname"));
	//	System.out.println("\t"+rs.getString("lname"));
		//System.out.println("\t"+rs.getString("salary"));
		
	//}
	System.out.println("inserted");
	stm.close();
	con.close();
	
	}

}

