package com.cts.loginapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	public static final String url="jdbc:mysql://localhost:3306/user?useSSL=false";
	public static final String class_name="com.mysql.jdbc.Driver";
	public static final String user="root";
	public static final String password="root";
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName(class_name);
		connection = DriverManager.getConnection(url,user,password);
		//System.out.println("Conection from util"+connection);
		return connection;
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void closeConnection(Connection connection){
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
