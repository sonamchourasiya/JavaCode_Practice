package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

  public class  Bugsdao implements AutoCloseable {
	private static  Connection con;
	public Bugsdao() throws SQLException
	{
	con=Db_util.getConnection();
	}
	public void Close()
	{
		try {
			if(con!=null)
				con.close();
			
		}catch (Exception e) {
		     e.printStackTrace();
		}
	}
	public int save(Bugs b) throws SQLException{
		String sql="insert into bugs values(default,?,?,?,?,?,?)";
	     try(PreparedStatement stmt=con.prepareStatement(sql)){
	    	 stmt.setString (1,b.getTittle());
	    	 stmt.setString (2,b.getDescription());
	    	 stmt.setString(3, b.getStatus());
	    	 
	    	 //stmt.setString (1,b.getTittle());
	    	 stmt.setInt(4,b.getAssigned_to());
	    	 SimpleDateFormat sdt=new SimpleDateFormat("dd:MM:yyy HH:mm:ss");
	    	 
	    	 stmt.setString(5,b.getCreated());
	    	 stmt.setString(6,b.getModified());
	    	 int cnt=stmt.executeUpdate();
	    	 return cnt;
	     }
	}
	public int updatestatus  (int id)throws Exception{
		String sql="UPDATE bugs set status='closed',modified=now(),where id=?";
     try(PreparedStatement stmt=con.prepareStatement(sql)){
    	 stmt.setInt(1, id);
    	 
    	 int cnt=stmt.executeUpdate();
    	 return cnt;
     }catch (Exception e) {
		e.printStackTrace();
	}
	return 0;
      
    		 
	
	
	}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
  }
	
