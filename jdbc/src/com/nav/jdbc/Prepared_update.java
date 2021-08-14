package com.nav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Prepared_update {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	int id =9;
	String fname = "Navneet";
	String lname = "Gohe";
	int salary = 30000;
	int dept_id = 5;

	PreparedStatement ps = (PreparedStatement) con.prepareStatement("update employee set fname=?,lname=?,salary=?,dept_id=? where id=?");
	
	ps.setString(1, fname);
	ps.setString(2, lname);
	ps.setInt(3, salary);
	ps.setInt(4, dept_id);
	ps.setInt(5, id);
	
	
	int i = ps.executeUpdate();
	System.out.println("inserted");
	ps.close();
	con.close();
	
	}

}
