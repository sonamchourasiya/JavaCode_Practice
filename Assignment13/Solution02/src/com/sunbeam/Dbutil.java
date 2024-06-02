package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	public static final String Db_driver="com.mysql.cj.jdbc.Driver";
			
    public static final  String Db_url="jdbc:mysql://localhost:3306/test";
    public static final String Db_user ="kd2_80179_sonam";
    public static final String Db_PASSWD="manager";
    
    static {
    	try {
    		Class.forName(Db_driver);
    	}
    	catch (ClassNotFoundException e) {
    		e.printStackTrace();
    		System.exit(1);
    	}
    }
    public static Connection getConnection() throws SQLException
    {
    Connection con	    =DriverManager.getConnection(Db_url, Db_user,Db_PASSWD);
    	return con;
    
    }
    
}
