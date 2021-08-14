package com.nav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import com.mysql.jdbc.CallableStatement;

public class Call_Stored_function {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");

		CallableStatement callstmt = (CallableStatement) con.prepareCall("{CALL Empcount(?)}");
		callstmt.registerOutParameter(1, Types.INTEGER);
		callstmt.execute();
		
		int Count = callstmt.getInt(1);
		System.out.println("Count " + Count);

	}

}
