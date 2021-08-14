package com.nav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Prepared_delete {
	public static void main(String[] args) throws Exception {
		testdelete();
	}

	private static void testdelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		int id = 11;
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("delete from employee where id = ?");
	ps.setInt(1, id);
	System.out.println("inserted");
	int i = ps.executeUpdate();
	}

}
