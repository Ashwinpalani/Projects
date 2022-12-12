package org.ashwin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import org.ashwin.Cab;

public class CabDBconnection {

	public static void main(String[] args) {
		Cab.emp = new HashMap<>();
		Cab.emp.put(001, "Ashwin");
		Cab.emp.put(002, "Esakki");
		Cab.emp.put(003, "Sam");
		Cab.emp.put(004, "sasi");
		Cab.emp.put(005, "Sathish");
		Cab.emp.put(006, "Naveen");
		try {

			Connection con = DriverManager.getConnection(
					"jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022", "sa1", "P@ssw0rd");
			Statement stmt = con.createStatement();
			stmt.execute("insert into Cab values("+ Cab.id+","+ Cab.emp.get(Cab.id) +","+Cab.location+","+Cab.bookedDate+","+Cab.bookedFor +","+Cab.d +","
			+Cab.rescheduledateto+ ")");
			//			System.err.println(Cab.emp);
//			ResultSet rs = stmt.executeQuery("insert into Cab values("+ Cab.id+","+ Cab.emp.get(Cab.id) +","+Cab.location+","+Cab.bookedDate+","+Cab.bookedFor +","+Cab.d +","
//			+Cab.rescheduledateto+ ")");
//			while (rs.next()) {
//				System.out.println(rs.getString(1));
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		updateDB(Cab.id,Cab.place);
	}

	public static void updateDB(int id, String place) {
	
		System.out.println(id);
		System.out.println(place);
		
		
	}

}
