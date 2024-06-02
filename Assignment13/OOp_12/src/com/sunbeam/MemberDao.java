package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class MemberDao implements AutoCloseable{
	private static Connection con;
	public MemberDao() throws SQLException
	{
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
	public int save(Member m)throws Exception{
		String Sql= "INSERT INTO members values(default,?,?)";
		try(PreparedStatement stmt=con.prepareStatement(Sql)){
			stmt.setString(1,m.getName());
			stmt.setString(2,m.getDesignation());
			int cnt=stmt.executeUpdate();
			return cnt;
				

}
}
}

