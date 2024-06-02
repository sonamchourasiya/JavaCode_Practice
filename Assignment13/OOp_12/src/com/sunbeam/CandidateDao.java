package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CandidateDao implements AutoCloseable{
	private Connection con;
	public CandidateDao() throws SQLException{
		con=Dbutil.getConnection();
	}
	public void close()
	{
		try {
			if(con !=null)
				con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
        public int save(Candidate c) throws SQLException{
        	String sql="insert into  candidates values";
        	public int save (Candidate c) throws SQLException{
        		String sql="insert into candidate values";
        		
        	}
        	try(PreparedStatement stmt=con.PreparedStatement(sql));
        			try(PreparedStatement stmt=con.prepareStatement(sql)){
        		    	 stmt.setString (1,b.getTittle());
        		    	 stmt.setString (2,b.getDescription());
        		    	 stmt.setString(3, b.getStatus());
        		    	 		
        }
}
