package Db_Test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;

public class TestConnection {

	public static void main(String[] arg) {
		String userName = "####";
		String password = "##########";

		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chennai", userName, password);

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output ");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("You are now conected to database!");
		} else {
			System.out.println("Failed  connection!");
		}
		try {

			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM emp");
		
		System.out.println(" ");
	
			while (rs.next()) {
			
				String i = rs.getString("empno");
				String s = rs.getString("deptno");
				System.out.println(s+ "\t");
				System.out.println(i);
			
			}
			connection.close();
			rs.close();
		} catch (SQLException s) {
			System.out.println("SQL code does not execute.");
		}

	}
}
