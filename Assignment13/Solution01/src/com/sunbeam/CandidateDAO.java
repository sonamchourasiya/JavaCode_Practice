 package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO implements AutoCloseable {
	private  static Connection con;
	public CandidateDAO() throws SQLException{
		con=Dbutil.getConnection();
		
	}
	public void close() {
	try {
		  if(con !=null)
			   con.close();
		  	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public int save(Candidate c)throws Exception {
	String sql = "INSERT INTO candidates values(default,?,?,?)";
	try(PreparedStatement stmt=con.prepareStatement(sql)){
		stmt.setString(1,c.getName());
		stmt.setString(2,c.getParty());
		stmt.setInt(3, c.getVotes());
		int cnt=stmt.executeUpdate();
		return cnt;
		
	}
	
}
public int update (Candidate c) throws Exception{

	String sql = "UPDATE candidates set name=?,party=? where id=?";
	try(PreparedStatement stmt=con.prepareStatement(sql)){
		stmt.setString(1,c.getName());
		stmt.setString(2,c.getParty());
		stmt.setInt(3,c.getId());
	int cnt=stmt.executeUpdate();
	
	return cnt;
	
}

}
public List<PartyVotes> getPartywiseVotes()throws Exception{
List<PartyVotes>list=new ArrayList<PartyVotes>();
  String sql="SELECT party ,sum(votes) FROM  candidates GROUP by party =?";
 try(PreparedStatement stmt =con.prepareStatement(sql)){
	 try(ResultSet rs=stmt.executeQuery()){
		while(rs.next()) {
			String party =rs.getString("party");
			int votes=rs.getInt("votes");
			PartyVotes p=new PartyVotes (party,votes);
			list.add(p);
			
		}
	 }
	 return list;
 }
 
}
}

