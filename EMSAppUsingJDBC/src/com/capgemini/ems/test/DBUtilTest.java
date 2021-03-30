package com.capgemini.ems.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capgemini.ems.util.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {
		DBUtil dbUtil = new DBUtil();
		String sql = "insert into employees (id,name,contact,email) values (?,?,?,?)";
		PreparedStatement pstmt = dbUtil.prepareStatement(sql);
		try {
			pstmt.setInt(1, 101);
			pstmt.setString(2, "Pankaj");
			pstmt.setString(3, "8827611875");
			pstmt.setString(4, "pankajsimmc@gmail.com");
			pstmt.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	

	}

}
