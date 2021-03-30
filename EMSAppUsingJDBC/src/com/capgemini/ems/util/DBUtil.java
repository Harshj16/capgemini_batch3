package com.capgemini.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This DBUtil Class will be responsible for performing DB related tasks.
 * like Register Driver, Getting Connection, providing prepared statement object etc. 
 * @author panka
 *
 */
public class DBUtil {
	private Connection con=null;
	private PreparedStatement pstmt=null;
	
	static {
		
		try {
			Class c = Class.forName("org.postgresql.Driver");
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	private Connection openConnection() {
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost/capgdb", "postgres","admin");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
	
	public PreparedStatement prepareStatement(String sql) {
		try {
			pstmt = openConnection().prepareStatement(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return pstmt;
	}
		
	public void closePrepareStatement() {
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
