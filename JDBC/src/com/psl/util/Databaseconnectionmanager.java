package com.psl.util;

import java.sql.Connection;
import java.sql.SQLException;

public interface Databaseconnectionmanager {
	
	
	public Connection getConnection() throws SQLException ;
	public void closeConnection();

}
