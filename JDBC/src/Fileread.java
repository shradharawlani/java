import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.psl.util.DatabaseConnectionManagetimp;


public class Fileread {
 public static void main(String[] args)
 {
	 Connection conn=null;
	 try
	 {
		 conn=new DatabaseConnectionManagetimp().getConnection();
		 		 
		 
		PreparedStatement pre=conn.prepareStatement("select * from tbl");
		ResultSet rs=pre.executeQuery();
		rs.next();
		
 			/*File f=new File("c:\\com\\psl.txt");

	FileReader fr=new FileReader(f);
	
	
	pre.setInt(1,103);
	pre.setCharacterStream(2, fr, (int)f.length());
	pre.executeUpdate();*/
			
			
			
				//FileWriter fw=new FileWriter(f);
				Clob c=rs.getClob(3);
				Reader r=c.getCharacterStream();
				
					FileWriter w=new FileWriter("c:\\com\\psl.txt");
				
				int i=0;
				while((i=r.read())!=-1)
				{
					w.write((char)(i));
				}
				
				
				w.close();  
			
			
			
			

	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
}
}
