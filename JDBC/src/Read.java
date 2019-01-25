import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.psl.util.DatabaseConnectionManagetimp;


public class Read {
public static void main(String[] args) {
	String read=null;
	String name=null;
	int num=0;
	Connection conn=null;
	/* try {
		conn=new DatabaseConnectionManagetimp().getConnection();
	
		 
	 
		//PreparedStatement pre=conn.prepareStatement("select * from tbl");
		//ResultSet rs=pre.executeQuery();
	
		BufferedReader fr=new BufferedReader(new FileReader("c:\\com\\psl.txt"));
		
		while((read=fr.readLine())!=null)
		{
			String[] splits=read.split("\\s");
			 name=splits[1];
			 num=Integer.parseInt(splits[0]);
		}
		
		PreparedStatement pre=conn.prepareStatement("insert into file values(?,?)");
		pre.setString(2, name);
		pre.setInt(1, num);
		pre.executeUpdate();
		fr.close();
		conn.close();
		
		
		
	} 
	catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} */
	try
	{
		
		conn=new DatabaseConnectionManagetimp().getConnection();
		
		PreparedStatement pre=conn.prepareStatement("select * from file");
		FileOutputStream fw=new FileOutputStream(new File("data.txt"));
		
	     ResultSet res=pre.executeQuery();
	     
	     while(res.next())
	     {   
	     
	    	 Clob c=res.getClob(1);
	    	 Reader r=c.getCharacterStream();
	    	 int reads=0;
	    	 while((reads=r.read())!=-1)
	    	 {
	    		 fw.write(reads);
	    	 }
	    	// fw.write(res.getByte(1));
	    	 String s=res.getString(2);
	         byte[] names=s.getBytes();
	        fw.write(names);
	        
	         
	     }
		
		
		
		
	}
	catch(SQLException | IOException e)
	{
		System.out.println(e.getMessage());
	}
}
}
