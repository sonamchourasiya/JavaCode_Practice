package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class membersdao implements AutoCloseable {
	private  static Connection con;
	public membersdao()  throws SQLException{
		con=Db_util.getConnection();
	}
	public void close()
	{
		try {
			if(con!=null)
				con.close();
		}catch (Exception e) {
			e.printStackTrace();
			}
	}
	
	//display all members
	public List<member>displayAll();
   List<member>list=new ArrayList<>();
   String sql="Select * from members";
   try(PreparedStatement stmt=con.prepareStatement(sql));
		   
				
		
	}

}id,name,designation;
