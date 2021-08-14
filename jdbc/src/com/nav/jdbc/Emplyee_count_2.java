package com.nav.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

import com.mysql.jdbc.CallableStatement;

public class Emplyee_count_2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		CallableStatement cs =  (CallableStatement) con.prepareCall("{?=CALL empcount()}");
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		System.out.println("count " + cs.getInt(1));
		
	}

}
