package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_util {
	
 // public static final String DB_driver="com.mysql.jdbc.Driver";
  public static final String Db_driver="com.mysql.cj.jdbc.Driver";
  public static final String Db_URL="jdbc:mysql://localhost:3306/btsdb";
 // public static final String Db_PASSWORD="manager";
  public static final String Db_USER="kd2_80179_sonam";
  public static final String Db_PASSWORD="manager";
  //public static final String Db_USER="kd2-80179";
  
  static {
	  try {
		  Class.forName(Db_driver);
	  }catch(ClassNotFoundException e) {
		  e.printStackTrace();
	  }
  }
	public static final Connection getConnection()throws SQLException
	{
		Connection con=DriverManager.getConnection(Db_URL,Db_USER,Db_PASSWORD);
		return con;
	}
}

