package Ashwin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class DbConnection {
	static SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");
	static SimpleDateFormat d2 = new SimpleDateFormat("hh:mm aa");
	
	Connection conn = null;
	Statement st = null;

	public DbConnection() {
		try {
			//System.out.println("0");

			conn = DriverManager.getConnection(
					"jdbc:sqlserver://192.168.168.12:1433;databaseName=New_joinee_2022;encrypt=true;trustServerCertificate=true;",
					"sa1", "P@ssw0rd");
			st = conn.createStatement();
			System.out.println("DB Connected Successfully");
		} catch (SQLException e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}

	}

	public void signupDB(Userdetails userdetails) {

		String query = "INSERT INTO CAB_USERDETAILS(NAME,USERNAME,PASSWORD) VALUES(" + userdetails.updateQuery() + ");";
		System.out.println(query);
		try {
			st.executeUpdate(query);
			System.out.println("Added Successfully");
		} catch (SQLException e) {
			System.out.println(" Failed");
			e.printStackTrace();
		}
	}

	public void BookingDetails(BookingDetails r,Userdetails u,double value) {
		String query = "INSERT INTO BOOKING_DETAILS(username,sourceLatitude,sourceLongitude,destinationLatitude,destinationLongitude,distance,ridefare) "
				+ "values('"+u.getUsername()+"',"+r.updateQuery()+"','"+value+"')";
		System.out.println(query);
		try {
			st.executeUpdate(query);
			System.out.println("Added Successfully");
		} catch (SQLException e) {
			System.out.println(" Failed");
			e.printStackTrace();
		}
	}
	
	public void schedule_Details(Rider r,Reschedule res) {
	    Userdetails u = new Userdetails();
		String query = "INSERT INTO ASHWIN_SCHEDULE_DETAILS(username,shift,bookedDay,bookedFor,day,rescheduleday, rescheduledateto,reShift)"
		+ "values('"+u.getUsername()+"','"+ r.updateQuery() +"',"+ res.updateQuery() +",'"+res.getReShift()+"')";
		System.out.println(query);
		try {
			st.executeUpdate(query);
			System.out.println("Added Successfully");
		} catch (SQLException e) {
			System.out.println(" Failed");
			e.printStackTrace();
		}
	}


}
