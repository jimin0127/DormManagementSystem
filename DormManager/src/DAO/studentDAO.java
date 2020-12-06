package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class studentDAO {
	private Connection conn;	
	private ResultSet rs;
	
	public studentDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/DORM?serverTimezone=UTC";
			String dbID = "root";
			String dbPassword = "1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
