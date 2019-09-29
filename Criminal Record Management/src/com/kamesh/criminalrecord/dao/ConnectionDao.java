package com.kamesh.criminalrecord.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDao {

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/criminalrecord";
		String username = "root";
		String password = "";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection in "+con);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Not able to connect because of :\n");
			e.printStackTrace();
		}
		return con;
	}
}
