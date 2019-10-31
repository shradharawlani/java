package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Override and implement all the methods of DBConnectionUtil here to create and close db connection 
public class DatabaseConnectionManager implements DBConnectionUtil {
	static {
   try {
	Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	 Connection conn;
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/questiondb","root","root");
		return conn;
	}

	@Override
	public void closeConnection() throws SQLException {
		conn.close();
		
	}


}
