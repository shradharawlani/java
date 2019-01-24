package com.psl.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManagetimp  implements Databaseconnectionmanager{


	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driverclass name  as argumrnt ,loading the driver,one time activity that why in static
		//class exception not give correct name of driver
	}
	
	
	
	
	private Connection connection;
	
	
	
	
	@Override
	public Connection getConnection() throws SQLException {
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root");
		return connection;
	}

	@Override
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
