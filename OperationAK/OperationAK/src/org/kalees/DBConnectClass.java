package org.kalees;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectClass {

	public static void main(String[] args) {
		try {

			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022", "NewJoinee2022", "P@ssw0rd");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select emp_name from Ash");
			while (rs.next()) {
				 System.out.println(rs.getString("emp_name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
