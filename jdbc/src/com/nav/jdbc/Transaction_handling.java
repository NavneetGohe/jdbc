package com.nav.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class Transaction_handling {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		con.setAutoCommit(false);
	Statement s =	(Statement) con.createStatement();
	int i = s.executeUpdate("insert into employee values(11,'suzeet','kumre',34000,4)");
	i = s.executeUpdate("insert into employee values(12,'captain','america',134000,3)");
	con.commit();
	s.close();
	con.close();
	}

}
