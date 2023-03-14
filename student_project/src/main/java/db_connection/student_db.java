package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class student_db {

	private static Connection conn = null;
private static String Driver="com.mysql.cj.jdbc.Driver";
	
	private static String URL="jdbc:mysql://localhost:3306/sys";
	
	private static String Username="root";
	
	private static String Password="root";
	
	public static Connection getConnection() {
		try {
			Class.forName(Driver);
			conn =DriverManager.getConnection(URL, Username, Password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}