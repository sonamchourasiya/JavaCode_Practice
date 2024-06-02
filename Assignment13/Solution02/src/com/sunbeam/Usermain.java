package com.sunbeam;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Usermain {

	public static void main(String[] args) throws Exception {
		
       Scanner sc =new Scanner(System.in);
		try(UserDao dao=new UserDao()){
			System.out.println("enter first name");
			String first_name=sc.next();
			System.out.println("enter last name");
			String last_name=sc.next();
			System.out.println("enter email");
			String email=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			System.out.println("enter dob");
			String dob=sc.next();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyy");
			System.out.println("enter Stat");
			String Stat=sc.next();
			System.out.println("enter roll");
			String roll=sc.next();
			System.out.println("enter id");
			int id=sc.nextInt();
			
			User u=new User(first_name,last_name, email,password,dob,Stat,roll,id);
			int cnt=dao.save(u);
			System.out.println("Insert row="+cnt);
			   
			
		
			
			
					
			
		
		
	}

}
}
