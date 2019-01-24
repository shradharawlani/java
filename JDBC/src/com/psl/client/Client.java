package com.psl.client;

import java.sql.*;

import javax.sql.PooledConnection;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.psl.util.DatabaseConnectionManagetimp;




public class Client {

	
		/*static
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//driverclass name  as argumrnt ,loading the driver,one time activity that why in static
			//class exception not give correct name of driver
		}*/
		public static void main(String[] args) {
			
          Connection connection=null;//establish connection

		
		try {
			
			
			
			
			connection=new DatabaseConnectionManagetimp().getConnection();
			BankAccount ac1=new BankAccount("shradha","1234",435.7,Date.valueOf("2019-01-24"));
			BankAccount ac2=new BankAccount("shweta","1235",436.7,Date.valueOf("2019-02-24"));
			
		 //connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root");
		 connection.setAutoCommit(false);//bydefault true
		 //transactions boundary marking boundary is called demarktransactions
			
			Statement statement;//interface to execute query
			statement= connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);//update the result set
		//	String sql=String.format("insert into tbl values('%s','%s','%f','%s')",ac1.getNumber(),ac1.getFullName(),ac1.getBalance(),ac1.getOpenedOn());
			//statement.executeUpdate(sql);
			//String sql=String.format("insert into tbl values('%s','%s','%f','%s')",ac2.getNumber(),ac2.getFullName(),ac2.getBalance(),ac2.getOpenedOn());
			//statement.executeUpdate(sql);
			ResultSet resultset;
			resultset=statement.executeQuery("select * from tbl");
			
			/*while(resultset.previous())
			{
			System.out.println(resultset.getString("accountnumber"));
			System.out.println(resultset.getString("fullname"));
			System.out.println(resultset.getDouble("balance"));
			System.out.println(resultset.getDate("opendate"));
			System.out.println("=====================");
			}*/
			resultset.absolute(2);//cursor point to second record
			resultset.relative(-1);//move to current position 2-1=1 record
			resultset.updateDouble("balance", 7869.9);//update record 1 shradha balance
			resultset.updateDate("opendate", Date.valueOf("2019-01-13"));//error bydefult resultset not updatable
			resultset.updateRow();//update on database
			resultset=statement.executeQuery("select * from tbl");
			while(resultset.next())
			{
			System.out.println(resultset.getString("accountnumber"));
			System.out.println(resultset.getString("fullname"));
			System.out.println(resultset.getDouble("balance"));
			System.out.println(resultset.getDate("opendate"));
			System.out.println("====================");
			}
			statement.close();
			
			
			//avoid execution of repeated query
			
             PreparedStatement prepareStatement;//interface
			prepareStatement=connection.prepareStatement("insert into tbl values(?,?,?,?)");
		
			

		prepareStatement.setString(1, "2133");
		prepareStatement.setString(2, "ash");
		prepareStatement.setDouble(3, 8940.7);
		prepareStatement.setDate(4, Date.valueOf("2019-4-23"));
			
			prepareStatement.executeUpdate();
			
			connection.commit();//transcations boundary
			MysqlConnectionPoolDataSource ds=new MysqlConnectionPoolDataSource();
			ds.setUrl("");
			ds.setUser("");
			ds.setPassword("");
			PooledConnection pc=ds.getPooledConnection();
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//jdbc class cms is database name 3306
		//default port number it return connection object
		
           finally
           {
        	if(connection!=null)
        		try
        	{
        	connection.close();		
        	}
        	catch(SQLException e)
        	{
        		e.printStackTrace();
        	}
           }
	

}
}