package org.kalees;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class LibraryClass {
	static Scanner s = new Scanner(System.in);
	static Map<String, String> m = new HashMap<>();

	public static void main(String[] args)
			throws IOException, InterruptedException, SQLException, ClassNotFoundException {
		m.put("PrathapaMudaliarCharithram", "MayavaramVedanayagamPillai");
		m.put("Periyapuranam", "Sekkilar");
		m.put("SilaNerangalilSilaManithargal", "D.Jayakanthan");
		m.put("VishnupuramandVenmurasu", "Jeymohan");
		m.put("Manimekalai", "Sattanar");
		m.put("Ramavatharam", "Kamban");
		m.put("Athichoodi", "Auvaiyar");
		m.put("Mooturai", "Auvaiyar");
		m.put("Kalingattuparani", "Jayamkondar");
		System.out.println("*****************Welcome to K-Library******************");
		Thread.sleep(2000);
		System.out.println("Enter Your Username : ");
		String name = s.next();
		userVerification(name);
		System.out.println("****************Thank You**********************");
	}

	public static void userVerification(String name)
			throws IOException, InterruptedException, SQLException, ClassNotFoundException {
		Set<String> userNames = new HashSet(Arrays.asList("kaleeswaran", "ashwin", "suseendran", "selva", "rahul",
				"anish", "arun", "tharun", "ilakiya", "gokul"));
		if (userNames.contains(name)) {
			System.out.println("Enter Your Password : ");
			PasswordVerification(name);
		} else {
			System.out.println("***************Invalid Username*************");
			Thread.sleep(1000);
			System.out.println("Enter valid Username : ");
			String user = s.next();
			userVerification(user);
		}
	}

	public static void bookMenu() throws SQLException, ClassNotFoundException {
		System.out.println("Select Book by\n1.Author Name\n2.Book Name");
		int choice = s.nextInt();
		if (choice == 1) {
			authorBook();
		} else if (choice == 2) {
			System.out.println("Available Books : ");
			System.out.println(m.keySet());
			bookSelection();
		} else {
			System.out.println("*************Enter Valid Option**************");
			bookMenu();
		}
	}

	public static void authorBook() throws ClassNotFoundException, SQLException {
		try {
			System.out.println("Available Authors : ");
			System.out.println(m.values());
			Thread.sleep(1000);
			System.out.println("Enter Author Name : ");
			String author = s.next();
			if (m.containsValue(author)) {
				System.out.println("Books Availabe For Your Selection : ");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "kaleesmech");
				Statement stat = con.createStatement();
				ResultSet exe = stat.executeQuery("Select Book_name from Library where Author_name='" + author + "'");
				while (exe.next()) {
					System.out.println(exe.getString(1));
				}
				bookSelection();
			} else {
				System.out.println("***************Invalid Name**************");
				authorBook();
			}

		}

		catch (Exception e) {

		}

	}

	public static void bookSelection() throws SQLException, ClassNotFoundException {

		try {
			Thread.sleep(1000);
			System.out.println("Enter Book Name You Want : ");
			String book = s.next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "kaleesmech");
			Statement stat = con.createStatement();
			ResultSet exe = stat.executeQuery("Select * from Library where book_name='" + book + "'");
			int num = 1;
			while (exe.next()) {

				System.out.println("Book Name : " + exe.getString(2) + "\nAuthor Name : " + exe.getString(3)
						+ "\nNumber of Page : " + exe.getString(4) + "\nAvailable Count : " + exe.getString(5)
						+ "\nBook Rate  : Rs." + exe.getString(6));
			}
			Thread.sleep(1000);
			endClass();
		}

		catch (Exception e) {

		}
	}

	public static void endClass() throws ClassNotFoundException, SQLException {

		System.out.println("If you want to Purchase Book \n1.Yes\n2.No");
		int cont = s.nextInt();
		if (cont == 1) {
			System.out.println("Book is Purchased");
		}
		else {
		System.out.println("If you want to continue \n1.Yes \n2.No");
		cont = s.nextInt();
		if (cont == 1) {
			bookMenu();
		}
		}

	}

	public static void PasswordVerification(String name)
			throws IOException, InterruptedException, SQLException, ClassNotFoundException {

		int pass = s.nextInt();
		FileInputStream fin = new FileInputStream(
				new File("C:\\Users\\kalees\\eclipse-workspace\\TeleAppsClass\\DataFiles\\UserPassword.properties"));
		Properties p = new Properties();
		p.load(fin);
		int password = Integer.parseInt(p.getProperty(name));
		if (password == pass) {
			bookMenu();
		} else {
			System.out.println("*************Invalid password**************");
			Thread.sleep(1000);
			System.out.println("Enter Valid Password : ");
			PasswordVerification(name);
		}

	}

}
