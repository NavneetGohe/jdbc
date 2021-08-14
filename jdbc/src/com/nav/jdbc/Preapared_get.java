package com.nav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Preapared_get {
	public static void main(String[] args) throws Exception {
		testGet(6);
			
	}

	public static void testGet(int o) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	
PreparedStatement ps  = (PreparedStatement) con.prepareStatement("Select * from employee where id = ?");

ps.setInt(1, o);

	ResultSet rs = ps.executeQuery();
	
	while (rs.next()) {
			System.out.print(rs.getString("id"));
			System.out.print("\t"+rs.getString("fname"));
		System.out.print("\t"+rs.getString("lname"));
		System.out.println("\t"+rs.getString("salary"));
			
		}
		
	}

}
