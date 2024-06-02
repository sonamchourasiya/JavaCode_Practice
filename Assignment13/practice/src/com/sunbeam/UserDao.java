package com.sunbeam;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

public class UserDao implements AutoCloseable {
	private static final String roll = null;
	private  Connection con;
	public UserDao()throws SQLException{
		con  = Dbutil.getConnection();
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
public int save(Users u)	throws Exception{
	String sql="insert into users values(default,?,?,?,?,?,?,?)";
     try(PreparedStatement stmt=con.prepareStatement(sql)){
    	 stmt.setString(1, u.getFirst_name());
    	 stmt.setString(2, u.getLast_name());
    	 stmt.setString(3, u.getEmail());
    	 stmt.setString(4, u.getPassword());
    	String date=u.getDob();
    	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    	java.util.Date uDate=sdf.parse(date);
    	
    	 java.sql.Date sDate=new java.sql.Date(uDate.getTime());
    	 stmt.setDate(5, sDate);
    	 stmt.setString(6, u.getStatus());
    	 stmt.setString(7, u.getRoll());
    	 int cnt= stmt.executeUpdate();
    	 return cnt;
    	 
    	 
    	 
     }
}
    
public int update(int id,String first_name,String last_name,String email,String password,String dob)throws Exception {
	String sql="UPDATE USERS set first_name=?,last_name=?,email=?,password=?,Dob=?,Status=>?,roll=? where id=?,";
	try(PreparedStatement stmt=con.prepareStatement(sql)){
	stmt.setString(1, first_name);
	 stmt.setString(2, last_name);
	 stmt.setString(3, email);
	 stmt.setString(4, password);
	 stmt.setString(5, dob);
	 SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
 	java.util.Date uDate=sdf.parse(dob);
 	
 	 java.sql.Date sDate=new java.sql.Date(uDate.getTime());
 	stmt.setString(5, dob);
	stmt.setInt(6, id);
	 stmt.setString(7, roll);
	 int cnt= stmt.executeUpdate();
	 return cnt;
	 
}
	
}
public int delete(int id) throws SQLException{
	String sql="DELETE FROM users WHERE ID=?";
	try (PreparedStatement stmt=con.prepareStatement(sql)){
		stmt.setInt(1, id);
		int cnt= stmt.executeUpdate();
		 return cnt;
		 
	}
	    public List<Users> Display() throws SQLException{
	    	List<Users>list=new ArrayList<user>();
	    	Select sql=SELECT * FROM Users;
		try(PreparedStatementStatement stmt=con.PreparedStatement(sql)){
			try(ResultSet rs=stmt.executeQuery()){
				while (rs.next()) {
					int id=rs.getInt(id);
					String name=rs.getString("first_name");
					String lname=rs.getString("lastname");
					String email=rs.getString("email");
					String password=rs.getString("password");
				    Date dt=rs.getDate("dob");
				    java.util.Date udate =new java.util.Date(dt.getTime());
				    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
				    String str=sdf.format(udate);
				    
					
				}
			}
		}
	}
	
	
}
}
