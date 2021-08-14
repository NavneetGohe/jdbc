package com.nav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Prepared_Statment {
	public static void main(String[] args) throws Exception {
		testAdd();
	}

	public static void testAdd() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		int id = 1;
		String fname = "arav";
		String lname = "choudhari";
		int salary = 40000;
		int dep_id = 1;

		PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into employee values (?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, fname);
		ps.setString(3, lname);
		ps.setInt(4, salary);
		ps.setInt(5, dep_id);
		
		ps.executeUpdate();
		
		System.out.println("inserted");
		
		
		
	}

}
