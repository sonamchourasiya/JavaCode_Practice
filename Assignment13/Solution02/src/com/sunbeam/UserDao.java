package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

public class UserDao implements AutoCloseable {
	private Connection con;
	public UserDao() throws SQLException{
		con=Dbutil.getConnection();
		
	}
	public void close()
	
	
	{
		try {
			if(con !=null)
				con.close();
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public int save(User u)throws Exception{
		String sql="INSERT INTO candidates values(?,?,?,?,?,?)";
		try(PreparedStatement stmt=con.prepareStatement(sql)){
			stmt.setString(1,u.getFirst_name());
			stmt.setString(2,u.getLast_name());
			stmt.setString(3,u.getEmail());
			stmt.setString(3, u.getPassword());
			stmt.setString(4,u.getDob());
			stmt.setString(5, u.getStat());
			int cnt=stmt.executeUpdate();
			return cnt;
			
		}
	}
	public int update (User u) throws Exception{
	String sql="UPDATE users set first_name=?,last_name=?,email=?,password=?,dob=?,Stat=?,role=? where id=?";
	try(PreparedStatement stmt= con.prepareStatement(sql)){
		stmt.setString(1,u.getFirst_name());
		stmt.setString(2,u.getLast_name());
		stmt.setString(3, u.getEmail());
		stmt.setString(4,u.getPassword());
		String str=u.getDob();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
		java.util.Date date=sdf.parse(str);
		
		
		java.sql.Date sDate= new java.sql.Date(date.getTime());
		
		stmt.setString(5,u.getDob());
		stmt.setString(6,u.getStat());
		
		//stmt.setString(7,u.getRoll());
	//	stmt.setInt(3, u.getId());
	
		int cnt=stmt.executeUpdate();
		//System.out.println("row affecte=+");
		return cnt;
		
	}
			


}
	public List<User> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	}